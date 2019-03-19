grammar SimpleCompiler;

number      : INT | FLOAT;
expression  : left=expression (MUL|DIV) right=expression #MulDiv
            | left=expression (ADD|SUB) right=expression #AddSub
            | VAR #Variable
            | number #num
            | LPAREN expression RPAREN #Parenthesis ;


INT     : [0-9]+ ;
FLOAT     : [0-9]+ '.' [0-9] * '.' [0-9]+ ;
LPAREN  : '(';
RPAREN  : ')';
ADD     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
WS      : [ \t\r\n\f]+ -> skip ;
VAR      : [a-zA-Z] [a-zA-Z0-9]* ;

