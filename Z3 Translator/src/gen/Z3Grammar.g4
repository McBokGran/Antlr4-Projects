grammar Z3Grammar;

@header{
package gen;
}

start: OPENINGBRACKET MODEL definefun* CLOSINGBRACKET EOF;

definefun: OPENINGBRACKET DEFINEFUN BOX OPENINGBRACKET CLOSINGBRACKET INTNAME INT CLOSINGBRACKET;

INT             : [1-9];
OPENINGBRACKET  : '(';
CLOSINGBRACKET  : ')';
MODEL           : 'model';
DEFINEFUN       : 'define-fun';
BOX             : 'a' [1-9] [1-9];
INTNAME         : 'Int';
WS : [ \t\r\n]+ -> skip ;