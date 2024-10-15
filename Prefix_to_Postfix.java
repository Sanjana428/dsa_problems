//You are given a string that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.

class Solution {
    static String preToPost(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        int i=exp.length()-1;
        while(i>=0){
            char ch=exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String val1=st.pop();
                String val2=st.pop();
                String ans=val1+val2+ch;
                st.push(ans);
            }
            else{
                st.push(ch+"");
            }
            i--;
        }
        return st.pop();
    }
}
