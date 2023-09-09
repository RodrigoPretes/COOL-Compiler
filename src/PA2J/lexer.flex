package PAJ2;

import PAJ2.TokenConstants;

%%
%class Lexer
%type TokenConstants
%line
%column

alpha = [a-zA-Z]
dig = [0-9]
id = {alpha} ({alpha} | {dig})*
type_id = {alpha}{alpha}*
int = {dig}+


%%
if { Lexer = yytext(); return IF;}
class { Lexer = yytext(); return CLASS;}
else { Lexer = yytext(); return ELSE;}
false { Lexer = yytext(); return FALSE;}
fi { Lexer = yytext(); return FI;}
in { Lexer = yytext(); return IN;}
inherits { Lexer = yytext(); return INHERITS;}
isvoid { Lexer = yytext(); return ISVOID;}
let { Lexer = yytext(); return LET;}
loop { Lexer = yytext(); return LOOP;}
pool { Lexer = yytext(); return POOL;}
then { Lexer = yytext(); return THEN;}
while { Lexer = yytext(); return WHILE;}
case { Lexer = yytext(); return CASE;}
esac { Lexer = yytext(); return ESAC;}
new { Lexer = yytext(); return NEW;}
of { Lexer = yytext(); return OF;}
not { Lexer = yytext(); return NOT;}
true { Lexer = yytext(); return TRUE;}
self { Lexer = yytext(); return SELF;}
{id} { Lexer = yytext(); return ID; }
{int} { Lexer = yytext(); return INT; }
{type_id} { Lexer = yytext(); return TYPE_ID;}
[ \t\n\r]+ { /* do nothing */ }
//<<EOF>> { return new Token(Tag.EOF); }
. { System.out.printf("error: unexpected char |%s|\n",
yytext());
}