/*
 *  The scanner definition for COOL.
 */

import java_cup.runtime.Symbol;

%%

%{

/*  Stuff enclosed in %{ %} is copied verbatim to the lexer class
 *  definition, all the extra variables/functions you want to use in the
 *  lexer actions should go here.  Don't remove or modify anything that
 *  was there initially.  */

    // Max size of string constants
    static int MAX_STR_CONST = 1025;

    // For assembling string constants
    StringBuffer string_buf = new StringBuffer();

    private int curr_lineno = 1;
    int get_curr_lineno() {
	return curr_lineno;
    }

    private AbstractSymbol filename;

    void set_filename(String fname) {
	filename = AbstractTable.stringtable.addString(fname);
    }

    AbstractSymbol curr_filename() {
	return filename;
    }
%}

%init{

/*  Stuff enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here.  Don't remove or modify anything that was there initially. */

    // empty for now
%init}

%eofval{

/*  Stuff enclosed in %eofval{ %eofval} specifies java code that is
 *  executed when end-of-file is reached.  If you use multiple lexical
 *  states and want to do something special if an EOF is encountered in
 *  one of those states, place your code in the switch statement.
 *  Ultimately, you should return the EOF symbol, or your lexer won't
 *  work.  */

    switch(yy_lexical_state) {
    case YYINITIAL:
	/* nothing special to do in the initial state */
	break;
	/* If necessary, add code for other states here, e.g:
	   case COMMENT:
	   ...
	   break;
	*/
    }
    return new Symbol(TokenConstants.EOF);
%eofval}

%class CoolLexer
%cup

alpha = [a-zA-Z]
dig = [0-9]
id = {alpha} ({alpha} | {dig})*
type_id = {alpha}{alpha}*
int = {dig}+

%%

<YYINITIAL>
"=>"			{ /* Sample lexical rule for "=>" arrow.
                                     Further lexical rules should be defined
                                     here, after the last %% separator */
                                  return new Symbol(TokenConstants.DARROW); }
"if" {
    return new Symbol(TokenConstants.IF);
}
"class" {
    return new Symbol(TokenConstants.CLASS);
}
"else" { 
    return new Symobl(TokenConstants.ELSE);
}
"false" {
    return new Symbol(TokenConstants.FALSE);
}
"fi" {
    return new Symbol(TokenConstants.FI);
}
"in" {
    return new Symbol(TokenConstants.IN);
}
"inherits" {
    return new Symbol(TokenConstants.INHERITS);
}
"isvoid" {
    return new Symbol(TokenConstants.ISVOID);
}
"let" {
    return new Symbol(TokenConstants.LET);
}
"loop" {
    return new Symbol(TokenConstants.LOOP);
}
"pool" {
    return new Symbol(TokenConstants.POOL);
}
"then" {
    return new Symbol(TokenConstants.THEN);
}
"while" {
    return new Symbol(TokenConstants.WHILE);
}
"case" {
    return new Symbol(TokenConstants.CASE);
}
"esac" {
    return new Symbol(TokenConstants.ESAC);
}
"new" {
    return new Symbol(TokenConstants.NEW);
}
"of" {
    return new Symbol(TokenConstants.OF);
}
"not" {
    return new Symbol(TokenConstants.NOT);
}
"true" {
    return new Symbol(TokenConstants.TRUE);
}
"self" {
    return new Symbol(TokenConstants.SELF);
}
"{id}" {
    return new Symbol(TokenConstants.OBJECTID);
}
"{int}" {
    return new Symbol(TokenConstants.INT_CONST);
}
"<EOF>" {
    return new Symbol(TokenConstants.EOF);
}
"*" {
    return new Symbol(TokenConstants.MULT);
}
"(" {
    return new Symbol(TokenConstants.LPAREN);
}
")" {
    return new Symbol(TokenConstants.RPAREN);
}
"/" {
    return new Symbol(TokenConstants.DIV);
}
"+" {
    return new Symbol(TokenConstants.PLUS);
}
"{" {
    return new Symbol(TokenConstants.LBRACE);
}
"}" {
    return new Symbol(TokenConstants.RBRACE);
}
.                               { /* This rule should be the very last
                                     in your lexical specification and
                                     will match match everything not
                                     matched by other lexical rules. */
                                  System.err.println("LEXER BUG - UNMATCHED: " + yytext()); }

