//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

//Evaluate the expression. Return an integer that represents the value of the expression.

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for (String ch : tokens) {
            if(ch.equals("+")|| ch.equals("-") || ch.equals("*")|| ch.equals("/")){
                int val2=st.pop();
                int val1=st.pop();
                int cal=calc(val1,val2,ch);
                st.push(cal);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
    public int calc(int val1,int val2,String op){
        if(op.equals("+"))return val1+val2;
        else if(op.equals("-"))return val1-val2;
        else if(op.equals("*"))return val1*val2;
        else if(op.equals("/"))return val1/val2;
        return 0;
    } 
}
