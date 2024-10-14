//Given a string s which represents an expression, evaluate this expression and return its value. 

class Solution {
    public int calculate(String s) {
        Stack<Integer> operand=new Stack<>();
        Stack<Character> op = new Stack<>();
        int i=0;
        while(i < s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int num=0;
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    num=num*10+(s.charAt(i)-'0');
                    // operand.push(num);
                    i++;
                }
                operand.push(num);
                i--;
            }
            else if(s.charAt(i) =='+' || s.charAt(i) =='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                while(op.size()>0 && prec(op.peek()) >= prec(s.charAt(i)) ){
                    char opr=op.pop();
                    int val2=operand.pop();
                    int val1=operand.pop();
                    int ans = calc(val1,val2,opr);
                    operand.push(ans);
                }
                op.push(s.charAt(i));
            }
                i++;
            
        }
        while(op.size() > 0 ){
                    char opr=op.pop();
                    int val2=operand.pop();
                    int val1=operand.pop();
                    int ans = calc(val1,val2,opr);
                    operand.push(ans);
                }
                return operand.pop();
    }
    public int calc(int val1,int val2,char op){
        if(op=='+'){return val1+val2;}
        else if(op=='-'){return val1-val2;}
        else if(op=='*'){return val1*val2;}
        else {return val1/val2;}
    }
    public int prec(Character op){
        if(op=='*' || op=='/'){return 1;}
        else {return 0;}
    }
}
