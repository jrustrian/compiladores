
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu May 12 23:50:40 CST 2022
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu May 12 23:50:40 CST 2022
  */
public class Syntax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Syntax() {super();}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\004\000\002\002\014\000\002\002" +
    "\014\000\002\002\014\000\002\003\004\000\002\003\003" +
    "\000\002\004\005\000\002\004\007\000\002\004\005\000" +
    "\002\004\007\000\002\004\005\000\002\004\007\000\002" +
    "\004\006\000\002\004\006\000\002\004\006\000\002\004" +
    "\007\000\002\004\007\000\002\004\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\110\000\010\030\005\031\006\032\004\001\002\000" +
    "\004\025\102\001\002\000\004\025\071\001\002\000\004" +
    "\025\011\001\002\000\004\002\010\001\002\000\004\002" +
    "\001\001\002\000\004\015\012\001\002\000\004\016\013" +
    "\001\002\000\004\017\014\001\002\000\014\026\020\030" +
    "\016\031\022\032\015\033\021\001\002\000\004\033\064" +
    "\001\002\000\004\033\057\001\002\000\016\026\020\030" +
    "\016\031\022\032\015\033\021\037\ufffc\001\002\000\004" +
    "\015\044\001\002\000\004\010\035\001\002\000\004\033" +
    "\030\001\002\000\004\037\024\001\002\000\004\035\025" +
    "\001\002\000\004\027\026\001\002\000\004\020\027\001" +
    "\002\000\004\002\uffff\001\002\000\006\010\032\027\031" +
    "\001\002\000\016\026\ufff9\030\ufff9\031\ufff9\032\ufff9\033" +
    "\ufff9\037\ufff9\001\002\000\004\034\033\001\002\000\004" +
    "\027\034\001\002\000\016\026\ufff8\030\ufff8\031\ufff8\032" +
    "\ufff8\033\ufff8\037\ufff8\001\002\000\010\034\036\035\040" +
    "\036\037\001\002\000\004\027\043\001\002\000\004\027" +
    "\042\001\002\000\004\027\041\001\002\000\016\026\ufff4" +
    "\030\ufff4\031\ufff4\032\ufff4\033\ufff4\037\ufff4\001\002\000" +
    "\016\026\ufff3\030\ufff3\031\ufff3\032\ufff3\033\ufff3\037\ufff3" +
    "\001\002\000\016\026\ufff5\030\ufff5\031\ufff5\032\ufff5\033" +
    "\ufff5\037\ufff5\001\002\000\010\034\045\035\047\036\046" +
    "\001\002\000\004\016\054\001\002\000\004\016\052\001" +
    "\002\000\004\016\050\001\002\000\004\027\051\001\002" +
    "\000\016\026\ufff1\030\ufff1\031\ufff1\032\ufff1\033\ufff1\037" +
    "\ufff1\001\002\000\004\027\053\001\002\000\016\026\ufff2" +
    "\030\ufff2\031\ufff2\032\ufff2\033\ufff2\037\ufff2\001\002\000" +
    "\004\027\055\001\002\000\016\026\ufff0\030\ufff0\031\ufff0" +
    "\032\ufff0\033\ufff0\037\ufff0\001\002\000\004\037\ufffd\001" +
    "\002\000\006\010\061\027\060\001\002\000\016\026\ufffb" +
    "\030\ufffb\031\ufffb\032\ufffb\033\ufffb\037\ufffb\001\002\000" +
    "\004\034\062\001\002\000\004\027\063\001\002\000\016" +
    "\026\ufffa\030\ufffa\031\ufffa\032\ufffa\033\ufffa\037\ufffa\001" +
    "\002\000\006\010\066\027\065\001\002\000\016\026\ufff7" +
    "\030\ufff7\031\ufff7\032\ufff7\033\ufff7\037\ufff7\001\002\000" +
    "\004\034\067\001\002\000\004\027\070\001\002\000\016" +
    "\026\ufff6\030\ufff6\031\ufff6\032\ufff6\033\ufff6\037\ufff6\001" +
    "\002\000\004\015\072\001\002\000\004\016\073\001\002" +
    "\000\004\017\074\001\002\000\014\026\020\030\016\031" +
    "\022\032\015\033\021\001\002\000\004\037\076\001\002" +
    "\000\004\034\077\001\002\000\004\027\100\001\002\000" +
    "\004\020\101\001\002\000\004\002\000\001\002\000\004" +
    "\015\103\001\002\000\004\016\104\001\002\000\004\017" +
    "\105\001\002\000\014\026\020\030\016\031\022\032\015" +
    "\033\021\001\002\000\004\037\107\001\002\000\004\036" +
    "\110\001\002\000\004\027\111\001\002\000\004\020\112" +
    "\001\002\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\110\000\004\002\006\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\003\022\004\016\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\003\055\004\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\003\074\004\016\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\105\004\016" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Syntax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    private static String output = "";

    public void syntax_error(Symbol s){
        this.s = s;
    }
    
    public Symbol getS() {
        return this.s;
    }

    public static void addOutput(String op){
        /*if (op.startsWith("\"")) {
            if (op.endsWith("\"")) {
                op = op.substring(1, op.length() - 1);
            }
        } */       
        
        Syntax.output += op;
    }

    public void cleanOutput(){
        this.output = "";
    }
    
    public String getOutput(){
        return this.output;
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Syntax$actions {
  private final Syntax parser;

  /** Constructor */
  CUP$Syntax$actions(Syntax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Syntax$do_action(
    int                        CUP$Syntax$act_num,
    java_cup.runtime.lr_parser CUP$Syntax$parser,
    java.util.Stack            CUP$Syntax$stack,
    int                        CUP$Syntax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntax$result;

      /* select the action based on the action number */
      switch (CUP$Syntax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // STATEMENT ::= PRINT OPENING_PARENTHESIS INTEGER CLOSING_PARENTHESIS SEMICOLON 
            {
              Object RESULT =null;
		int integerleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).left;
		int integerright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).right;
		Object integer = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).value;
		 Syntax.addOutput(integer.toString());
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // STATEMENT ::= PRINT OPENING_PARENTHESIS DECIMAL CLOSING_PARENTHESIS SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // STATEMENT ::= PRINT OPENING_PARENTHESIS STRING CLOSING_PARENTHESIS SEMICOLON 
            {
              Object RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).right;
		Object str = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).value;
		 Syntax.addOutput(str.toString());
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // STATEMENT ::= IDENTIFIER EQUALS STRING SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // STATEMENT ::= IDENTIFIER EQUALS DECIMAL SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // STATEMENT ::= IDENTIFIER EQUALS INTEGER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // STATEMENT ::= STRING_DATATYPE IDENTIFIER EQUALS INTEGER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // STATEMENT ::= STRING_DATATYPE IDENTIFIER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // STATEMENT ::= DECIMAL_DATATYPE IDENTIFIER EQUALS INTEGER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // STATEMENT ::= DECIMAL_DATATYPE IDENTIFIER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // STATEMENT ::= INTEGER_DATATYPE IDENTIFIER EQUALS INTEGER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // STATEMENT ::= INTEGER_DATATYPE IDENTIFIER SEMICOLON 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENT",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // STATEMENTS ::= STATEMENT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENTS",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // STATEMENTS ::= STATEMENT STATEMENTS 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("STATEMENTS",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // START ::= STRING_DATATYPE MAIN OPENING_PARENTHESIS CLOSING_PARENTHESIS OPENING_BRACE STATEMENTS RETURN STRING SEMICOLON CLOSING_BRACE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-9)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // START ::= DECIMAL_DATATYPE MAIN OPENING_PARENTHESIS CLOSING_PARENTHESIS OPENING_BRACE STATEMENTS RETURN DECIMAL SEMICOLON CLOSING_BRACE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-9)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // START ::= INTEGER_DATATYPE MAIN OPENING_PARENTHESIS CLOSING_PARENTHESIS OPENING_BRACE STATEMENTS RETURN INTEGER SEMICOLON CLOSING_BRACE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-9)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		RESULT = start_val;
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntax$parser.done_parsing();
          return CUP$Syntax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

