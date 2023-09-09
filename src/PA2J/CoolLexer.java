/* The following code was generated by JFlex 1.7.0 */

/*
 *  The scanner definition for COOL.
 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>cool.lex</tt>
 */
class CoolLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\37\1\37\1\37\1\37\32\0\1\33\1\34\1\32\1\36"+
    "\3\0\1\35\12\0\2\0\1\26\1\1\1\2\2\0\4\0\1\27"+
    "\1\31\10\0\1\30\13\0\6\0\1\7\1\0\1\5\1\20\1\11"+
    "\1\4\1\0\1\13\1\3\2\0\1\6\1\0\1\12\1\17\1\21"+
    "\1\0\1\14\1\10\1\15\1\23\1\16\1\22\3\0\1\24\1\0"+
    "\1\25\7\0\1\37\u1fa2\0\1\37\1\37\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\15\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\0\1\13\1\14\14\0"+
    "\1\15\11\0\1\16\4\0\1\17\1\20\13\0\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\0"+
    "\1\31\3\0\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\2\0\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\u0160\0\u0180\0\u01a0\0\u01c0\0\40"+
    "\0\u01e0\0\40\0\40\0\40\0\40\0\40\0\40\0\40"+
    "\0\u0200\0\u0220\0\40\0\u0240\0\u0260\0\u0280\0\u02a0\0\u02c0"+
    "\0\u02e0\0\u0300\0\u0320\0\u0340\0\u0360\0\u0380\0\u03a0\0\40"+
    "\0\u03c0\0\u03e0\0\u0400\0\u0420\0\u0440\0\u0460\0\u0480\0\u04a0"+
    "\0\u04c0\0\40\0\u04e0\0\u0500\0\u0520\0\u0540\0\40\0\40"+
    "\0\u0560\0\u0580\0\u05a0\0\u05c0\0\u05e0\0\u0600\0\u0620\0\u0640"+
    "\0\u0660\0\u0680\0\u06a0\0\40\0\40\0\40\0\40\0\40"+
    "\0\40\0\40\0\40\0\u06c0\0\u06e0\0\40\0\u0700\0\u0720"+
    "\0\u0740\0\40\0\40\0\40\0\40\0\40\0\40\0\u0760"+
    "\0\u0780\0\40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\2"+
    "\1\10\1\11\1\12\2\2\1\13\1\2\1\14\1\2"+
    "\1\15\1\16\1\2\1\17\1\20\1\21\3\2\1\22"+
    "\1\23\1\24\1\25\1\26\43\0\1\27\41\0\1\30"+
    "\3\0\1\31\1\0\1\32\30\0\1\33\3\0\1\34"+
    "\36\0\1\35\1\36\41\0\1\37\5\0\1\40\31\0"+
    "\1\41\34\0\1\42\1\0\1\43\40\0\1\44\5\0"+
    "\1\45\33\0\1\46\1\47\27\0\1\50\52\0\1\51"+
    "\33\0\1\52\27\0\1\53\63\0\1\54\26\0\1\55"+
    "\34\0\1\56\32\0\1\57\40\0\1\60\40\0\1\61"+
    "\44\0\1\62\41\0\1\63\26\0\1\64\41\0\1\65"+
    "\36\0\1\66\52\0\1\67\32\0\1\70\33\0\1\71"+
    "\51\0\1\72\33\0\1\73\23\0\1\74\46\0\1\75"+
    "\5\0\1\76\47\0\1\77\26\0\1\100\31\0\1\101"+
    "\36\0\1\102\37\0\1\103\40\0\1\104\47\0\1\105"+
    "\22\0\1\106\44\0\1\107\33\0\1\110\44\0\1\111"+
    "\36\0\1\112\34\0\1\113\37\0\1\114\46\0\1\115"+
    "\47\0\1\116\43\0\1\117\11\0\1\120\50\0\1\121"+
    "\34\0\1\122\36\0\1\123\40\0\1\124\53\0\1\125"+
    "\14\0\1\126\55\0\1\127\22\0\1\130\51\0\1\131"+
    "\32\0\1\132\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1952];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\15\1\1\11\1\1\7\11\1\0\1\1"+
    "\1\11\14\0\1\11\11\0\1\11\4\0\2\11\13\0"+
    "\10\11\2\0\1\11\3\0\6\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CoolLexer(java.io.Reader in) {
  
/*  Stuff enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here.  Don't remove or modify anything that was there initially. */

    // empty for now
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { 
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
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* This rule should be the very last
                                     in your lexical specification and
                                     will match match everything not
                                     matched by other lexical rules. */
                                  System.err.println("LEXER BUG - UNMATCHED: " + yytext());
            } 
            // fall through
          case 33: break;
          case 2: 
            { return new Symbol(TokenConstants.LBRACE);
            } 
            // fall through
          case 34: break;
          case 3: 
            { return new Symbol(TokenConstants.RBRACE);
            } 
            // fall through
          case 35: break;
          case 4: 
            { return new Symbol(TokenConstants.MULT);
            } 
            // fall through
          case 36: break;
          case 5: 
            { return new Symbol(TokenConstants.LPAREN);
            } 
            // fall through
          case 37: break;
          case 6: 
            { return new Symbol(TokenConstants.RPAREN);
            } 
            // fall through
          case 38: break;
          case 7: 
            { return new Symbol(TokenConstants.DIV);
            } 
            // fall through
          case 39: break;
          case 8: 
            { return new Symbol(TokenConstants.PLUS);
            } 
            // fall through
          case 40: break;
          case 9: 
            { /* Sample lexical rule for "=>" arrow.
                                     Further lexical rules should be defined
                                     here, after the last %% separator */
                                  return new Symbol(TokenConstants.DARROW);
            } 
            // fall through
          case 41: break;
          case 10: 
            { return new Symbol(TokenConstants.IF);
            } 
            // fall through
          case 42: break;
          case 11: 
            { return new Symbol(TokenConstants.IN);
            } 
            // fall through
          case 43: break;
          case 12: 
            { return new Symbol(TokenConstants.FI);
            } 
            // fall through
          case 44: break;
          case 13: 
            { return new Symbol(TokenConstants.OF);
            } 
            // fall through
          case 45: break;
          case 14: 
            { return new Symbol(TokenConstants.LET);
            } 
            // fall through
          case 46: break;
          case 15: 
            { return new Symbol(TokenConstants.NEW);
            } 
            // fall through
          case 47: break;
          case 16: 
            { return new Symbol(TokenConstants.NOT);
            } 
            // fall through
          case 48: break;
          case 17: 
            { return new Symbol(TokenConstants.CASE);
            } 
            // fall through
          case 49: break;
          case 18: 
            { return new Symbol(TokenConstants.LOOP);
            } 
            // fall through
          case 50: break;
          case 19: 
            { return new Symbol(TokenConstants.SELF);
            } 
            // fall through
          case 51: break;
          case 20: 
            { return new Symobl(TokenConstants.ELSE);
            } 
            // fall through
          case 52: break;
          case 21: 
            { return new Symbol(TokenConstants.ESAC);
            } 
            // fall through
          case 53: break;
          case 22: 
            { return new Symbol(TokenConstants.THEN);
            } 
            // fall through
          case 54: break;
          case 23: 
            { return new Symbol(TokenConstants.TRUE);
            } 
            // fall through
          case 55: break;
          case 24: 
            { return new Symbol(TokenConstants.POOL);
            } 
            // fall through
          case 56: break;
          case 25: 
            { return new Symbol(TokenConstants.OBJECTID);
            } 
            // fall through
          case 57: break;
          case 26: 
            { return new Symbol(TokenConstants.FALSE);
            } 
            // fall through
          case 58: break;
          case 27: 
            { return new Symbol(TokenConstants.CLASS);
            } 
            // fall through
          case 59: break;
          case 28: 
            { return new Symbol(TokenConstants.WHILE);
            } 
            // fall through
          case 60: break;
          case 29: 
            { return new Symbol(TokenConstants.INT_CONST);
            } 
            // fall through
          case 61: break;
          case 30: 
            { return new Symbol(TokenConstants.EOF);
            } 
            // fall through
          case 62: break;
          case 31: 
            { return new Symbol(TokenConstants.ISVOID);
            } 
            // fall through
          case 63: break;
          case 32: 
            { return new Symbol(TokenConstants.INHERITS);
            } 
            // fall through
          case 64: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}