//Given an infix expression in the form of string str. Convert this infix expression to postfix expression.

Infix expression: The expression of the form a op b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. Ignore the right associativity of ^.//

class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<String> operand=new Stack<>();
        Stack<Character> operator= new Stack<>();
        int i=0;
        while(i<exp.length()){
            char num=exp.charAt(i);
            if(num=='('){operator.push(num);}
            else if(num==')'){
                while(operator.peek()!= '('){
                    char op=operator.pop();
                    String val2=operand.pop();
                    String val1=operand.pop();
                    String cal=val1+val2+op;
                    operand.push(cal);
                }
                operator.pop();
            }
            else if(num=='^' || num=='*' || num=='/' || num=='+' || num=='-'){
                while(operator.size()>0 && prec(operator.peek()) >= prec(num)){
                    char op=operator.pop();
                    String val2=operand.pop();
                    String val1=operand.pop();
                    String cal=val1+val2+op;
                    operand.push(cal+"");
                }
                operator.push(num);
            }
            else {operand.push(num+"");}
            i++;
        }
        while(operator.size()>0){
            char op=operator.pop();
                    String val2=operand.pop();
                    String val1=operand.pop();
                    String cal=val1+val2+op;
                    operand.push(cal+"");
        }
        return operand.pop();
    }
    public static int prec(char ch){
        if(ch=='^')return 2;
        if(ch=='/' || ch=='*')return 1;
        if(ch=='+' || ch=='-') return 0;
        else return -1;
    }
}
