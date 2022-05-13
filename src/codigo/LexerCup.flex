package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_']+
D=[0-9]+
SPACE=[ ,\t,\r,\n]+
CHARACTERS=[-'0-9a-zÀ-ÿ_%+-@!¡'¿?\\]+
%{
    
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    
%}
%%


ajl {return new Symbol(sym.INTEGER_DATATYPE, yychar, yyline, yytext());}
alanel {return new Symbol(sym.DECIMAL_DATATYPE, yychar, yyline, yytext());}
tz'iib' {return new Symbol(sym.STRING_DATATYPE, yychar, yyline, yytext());}

xaq {return new Symbol(sym.IF, yychar, yyline, yytext());}
while {return new Symbol(sym.WHILE, yychar, yyline, yytext());}
for {return new Symbol(sym.FOR, yychar, yyline, yytext());}
else {return new Symbol(sym.ELSE, yychar, yyline, yytext());}
tz'iib'a {return new Symbol(sym.PRINT, yychar, yyline, yytext());}
xeelank {return new Symbol(sym.MAIN, yychar, yyline, yytext());}
q'oot {return new Symbol(sym.RETURN, yychar, yyline, yytext());}

{SPACE} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return new Symbol(sym.EQUALS, yychar, yyline, yytext());}
"+" {return new Symbol(sym.ADDITION, yychar, yyline, yytext());}
"-" {return new Symbol(sym.SUBTRACTION, yychar, yyline, yytext());}
"*" {return new Symbol(sym.MULTIPLICATION, yychar, yyline, yytext());}
"/" {return new Symbol(sym.DIVISION, yychar, yyline, yytext());}
"(" {return new Symbol(sym.OPENING_PARENTHESIS, yychar, yyline, yytext());}
")" {return new Symbol(sym.CLOSING_PARENTHESIS, yychar, yyline, yytext());}
"{" {return new Symbol(sym.OPENING_BRACE, yychar, yyline, yytext());}
"}" {return new Symbol(sym.CLOSING_BRACE, yychar, yyline, yytext());}
"[" {return new Symbol(sym.OPENING_BRACKET, yychar, yyline, yytext());}
"]" {return new Symbol(sym.CLOSING_BRACKET, yychar, yyline, yytext());}
">" {return new Symbol(sym.GREATER_THAN, yychar, yyline, yytext());}
"<" {return new Symbol(sym.LESS_THAN, yychar, yyline, yytext());}
\" ({CHARACTERS}|{L}|{D}|{SPACE})* \" {return new Symbol(sym.STRING, yychar, yyline, yytext());}

";" {return new Symbol(sym.SEMICOLON, yychar, yyline, yytext());}

{L}({L}|{D})* {return new Symbol(sym.IDENTIFIER, yychar, yyline, yytext());}
("(-"{D}+")") | {D}+ {return new Symbol(sym.INTEGER, yychar, yyline, yytext());}
("-"{D}+)|{D}+\.{D}+ {return new Symbol(sym.DECIMAL, yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}

