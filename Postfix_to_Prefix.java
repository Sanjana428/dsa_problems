//You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its prefix form.

// User function Template for Java

class Solution {
    static String postToPre(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        int i=0;
        while(i<exp.length()){
            char ch=exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String val2=st.pop();
                String val1=st.pop();
                String ans=ch+val1+val2;
                st.push(ans);
            }
            else{st.push(ch+"");}
            i++;
        }
        return st.pop();
        }
}
