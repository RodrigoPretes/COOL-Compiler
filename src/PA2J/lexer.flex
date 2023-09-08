%%
%class Lexer
%type Token
%line
%column
%{
private Token token(Token.T type)
{
return new Token(type, yyline, yycolumn);
}
private Token token(Token.T type, Object val)
{
return new Token(type, val, yyline, yycolumn);
}
%}
alpha = [a-zA-Z]
dig = [0-9]
id = {alpha} ({alpha} | {dig})*
type_id = {alpha}{alpha}*
int = {dig}+
%%
if { return token(Token.T.IF); }
class { return new Token(Tag.CLASS, yytext());}
else { return new Token(Tag.ELSE, yytext());}
false { return new Token(Tag.FALSE, yytext());}
fi { return new Token(Tag.FI, yytext());}
in { return new Token(Tag.IN, yytext());}
inherits { return new Token(Tag.INHERITS, yytext());}
isvoid { return new Token(Tag.ISVOID, yytext());}
let { return new Token(Tag.LET, yytext());}
loop { return new Token(Tag.LOOP, yytext());}
pool { return new Token(Tag.POOL, yytext());}
then { return new Token(Tag.THEN, yytext());}
while { return new Token(Tag.WHILE, yytext());}
case { return new Token(Tag.CASE, yytext());}
esac { return new Token(Tag.ESAC, yytext());}
new { return new Token(Tag.NEW, yytext());}
of { return new Token(Tag.OF, yytext());}
not { return new Token(Tag.NOT, yytext());}
true { return new Token(Tag.TRUE, yytext());}
self { return new Token(Tag.SELF, yytext());}
{id} { return new Token(Tag.ID, yytext()); }
{int} { return new Token(Tag.INT, new Integer(yytext())); }
{type_id} { return new Token(Tag.TYPE_ID, yytext());}
[ \t\n\r]+ { /* do nothing */ }
<<EOF>> { return new Token(Tag.EOF); }
. { System.out.printf("error: unexpected char |%s|\n",
yytext());
}