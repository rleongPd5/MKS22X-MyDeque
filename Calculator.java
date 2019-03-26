public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<int> m = new MyDeque(s.length() / 2 + 1); //create a new MyDeque
      for (int i = 0; i < s.length(); i++){ //loop through the string
        if (isOperator(charAt(i))){
          Double val2 = m.removeLast();
          Double val1 = m.removeLast();
          m.addLast(val1+val2);
        }
        else{
          m.addLast(charAt(i)+0)); //makes this an integer
        }
        return m.getLast();
      }
    }

    /* Notes on deque
    Add: (push / en-queue)
    Get: return but NOT remove the element. (peek)
    Remove: return AND remove the element. (pop / de-queue)
    */
    //helper method to divide up the string
    //public static MyDeque tokenize(String s){

    //}

    //helper method for determining whether or not something is an operator
    public static boolean isOperator(char c){
      return (c == '+' ||c == '-' || c==' *' || c == '/' || c == '%');
    }
}
/*
1. Convert your string into tokens. (A list of values and operators)
1b. Test this by printing each one!
2. Instead of printing each one, decide what to do with them...
*/
