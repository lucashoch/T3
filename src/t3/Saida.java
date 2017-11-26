/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Saida {
    private static StringBuffer texto = new StringBuffer();
    private static boolean modificado;
    private static List<String> entradas = new ArrayList<String>();
    
    public static void println(String txt) {
        if(!modificado) modificado = true;
        
        if(!isIn(txt)){
            texto.append(txt).append("\n");
            entradas.add(txt);
        }
    }
    
    public static void clear() {
        texto = new StringBuffer();
        modificado = false;
    }
    
    private static boolean isIn(String txt){
        for(String s : entradas){
            if(s.equals(txt))
                return true;
        }
        return false;
    }
    
    public static String getTexto() {
        return texto.toString();
    }
    
    public static boolean modificado(){
        return modificado;
    }
}
