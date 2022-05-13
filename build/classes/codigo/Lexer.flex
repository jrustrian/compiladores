package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_']+
D=[0-9]+
SPACE=[ ,\t,\r]+
CHARACTERS=[-'0-9a-zÀ-ÿ_%+-@!¡'¿?]+
%{
    public String lexeme;
%}
%%

ajl {return INTEGER_DATATYPE;}
alanel {return DECIMAL_DATATYPE;}
tz'iib' {return STRING_DATATYPE;}

xaq {return IF;}
while {return WHILE;}
for {return FOR;}
else {return ELSE;}
tz'iib'a {return PRINT;}
xeelank {return MAIN;}
q'oot {return RETURN;}

";" {return SEMICOLON;}

{SPACE} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n" {return EOL;}
"=" {return EQUALS;}
"+" {return ADDITION;}
"-" {return SUBTRACTION;}
"*" {return MULTIPLICATION;}
"/" {return DIVISION;}
"(" {return OPENING_PARENTHESIS;}
")" {return CLOSING_PARENTHESIS;}
"{" {return OPENING_BRACE;}
"}" {return CLOSING_BRACE;}
"[" {return OPENING_BRACKET;}
"]" {return CLOSING_BRACKET;}
">" {return GREATER_THAN;}
"<" {return LESS_THAN;}
\" ({CHARACTERS}|{L}|{D}|{SPACE})* \" {return STRING;}

{L}({L}|{D})* {lexeme=yytext(); return IDENTIFIER;}
("-"{D}+) | {D}+ {lexeme=yytext(); return INTEGER;}
("-"{D}+)|{D}+\.{D}+ {lexeme=yytext(); return DECIMAL;}

 . {return ERROR;}