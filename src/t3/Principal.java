/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author lucas
 */
public class Principal {
    
    private final static String CAMINHO_CASOS_TESTE = "D:\\GitHub\\casosTesteT3";

    
    public static void main(String[] args) throws IOException, RecognitionException {
        File[] casosTeste = null;
        boolean arqUnico = false;
        File diretorioDeSaida = null;
        
        try {
            if (args[0] != null && !"".equals(args[0]) && args[1] != null && !"".equals(args[1])){
                casosTeste = new File[1];
                casosTeste[0] = new File(args[0]);
                diretorioDeSaida = new File(args[1]);
                arqUnico = true;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        
        if (!arqUnico){
            File diretorioCasosTeste = new File(CAMINHO_CASOS_TESTE);
            casosTeste = diretorioCasosTeste.listFiles();
        }
        

        for (File casoTeste : casosTeste) {
            System.out.println("\n\n\nComeçando::   "+ casoTeste.getName());
            Saida.clear();
            

            SaidaParser out = new SaidaParser();
            
            
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoTeste));
            FractALLexer lexer = new FractALLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FractALParser parser = new FractALParser(tokens);
            parser.addErrorListener(new T3ErrorListener(out));
            FractALParser.ProgramaContext arvore = null;
            
            
            
            try {
                arvore =  parser.programa();
             } catch (ParseCancellationException pce) {
                if (pce.getMessage() != null) {
                   out.println(pce.getMessage());
                }
            }
            if (out.isModificado()){
                out.println("Fim da compilacao");
                if(arqUnico){
                    PrintWriter writer = new PrintWriter(diretorioDeSaida, "UTF-8");
                    writer.print(out);
                    writer.close();                
                }                
            } else {
                AnalisadorSemantico analisadorSemantico = new AnalisadorSemantico();
                analisadorSemantico.visitPrograma(arvore); 
                if (Saida.modificado()){
                    Saida.println("Fim da compilacao");
                    System.out.print("\n" + Saida.getTexto());
                    if(arqUnico){
                        PrintWriter writer = new PrintWriter(diretorioDeSaida, "UTF-8");
                        writer.print(Saida.getTexto());
                        writer.close();                
                    }
                } else{
                    GeradorDeCodigo geraCod = new GeradorDeCodigo();
                    String codigoGerado = geraCod.visitPrograma(arvore);
                    System.out.println(codigoGerado + "\n\n\n");
                    
                    if(arqUnico){
                        PrintWriter writer = new PrintWriter(diretorioDeSaida, "UTF-8");
                        writer.print(codigoGerado);
                        writer.close();  
                    }
                }
            }
            
            System.out.println(out.toString());
            Saida.clear();
            
        }
    }
}
