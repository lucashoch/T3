grammar FractAL;

@members { 
        private void stop(String string) {
            throw new ParseCancellationException(string);
        }
}

programa: 'begin:' comandos 'end.';

comandos: (comando ';')+;

comando: declaracao |
         operacao
         ;

declaracao: tipo VAR;

operacao: VAR opr;

tipo: ('Triangle' | 'Circle' | 'Square');

opr: ('repeat' | 'offsetRepeat') '(' NUM ',' NUM ')';



VAR: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

NUM: NUM_INT | NUM_REAL;

NUM_INT: ('0'..'9')+;

NUM_REAL: NUM_INT '.' NUM_INT;

Comentario: '/*' (.*?) '*/' -> skip;

Comentario_Linha:  '#' ~( '\r' | '\n' )* -> skip;

Espaco : [ \t\r\n]+ {skip();}      // espaço = em branco, tab, "Enter" ou nova linha, uma ou mais vezes
    ;

ERROR: . {stop("Linha "+getLine()+": "+getText()+" - simbolo nao identificado");};
