grammar LabeledExpr; // rename to distinguish from Expr.g4

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
	|   whileStat NEWLINE        # whileLoop
	|	ifStat	NEWLINE			#ifStatement
	|   relational NEWLINE          # relat
    |   NEWLINE                     # blank
    ;

expr:  op=FACT expr 		#Fact
	| 	expr op=EXP expr      # Exp
	|   expr op=MUL expr      # Mul
	|   expr op=DIV expr      # Div
    |   expr op=ADD expr      # Add
	|   expr op=SUB expr      # Sub
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    ;
relational:     expr op=(GREATER|LESS) expr     # GreaterEqual
          ;

whileStat:  'while' '('relational')' NEWLINE? '{'stat*'}'   #while
		  ;
ifStat: 'if''('relational')' NEWLINE? '{'stat*'}'          #if
      ;
EQUALTO: '==';
GREATER : '>' ;
LESS : '<' ;
EXP: '^' ;
FACT: '!';
MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace