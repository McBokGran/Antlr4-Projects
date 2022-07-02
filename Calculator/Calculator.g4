grammar Calculator;

start: expr+ EOF;


variable: 'int' NAME '=' expr SEMICOLON;
string: 'string' NAME '=' STRING SEMICOLON;
bool: 'bool' NAME '=' BOOL SEMICOLON;
print: PRINT STRING (',' STRING)*;

expr: op='!' expr #Fact
    | expr op='^' expr # Exp
    | expr op=('*'|'/') expr # MulDiv
    | expr op=('+'|'-') expr # AddSub
    | INT                    # Int
    | '('expr')'             # Parens
    ;

PRINT: 'print';
BOOL: TRUE | FALSE;
NAME: ([a-z] | [A-Z])+;
STRING: '"' ('\\' ["\\] | ~["\\\r\n])* '"';
INT: [0-9]+ ;
TRUE: 'True' | [1];
FALSE: 'False' | [0];	
EXP: '^' ;
FACT: '!' ;
MUL: '*' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;
SEMICOLON: ';' ;
WS : [ \t\r\n]+ -> skip ;