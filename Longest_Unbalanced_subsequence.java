// A student of Algoprep has recently found out about groupings of brackets (sequences of parentheses).

// A balanced parentheses sequence follows the following definition:
// 1. An empty sequence is balanced.
// 2. If R is a balanced sequence, then (R) is also balanced.
// 3. If M and N represent two balanced sequences, then their concatenation MN is also balanced.

// the sequences (), ()() and (())() are balanced, while ()) and ))() are unbalanced.

// Now, you need to find the length of longest unbalanced subsequence of the given string (containing '(' and ')').


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            // if(st.size()==0){st.push(str.charAt(i));}
            if(str.charAt(i)=='('){
                st.push('(');
            }
            else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{st.push(')');}
            }
        }
        if(st.size()!=0){
            System.out.print(str.length());
        }
        else{
            System.out.print(str.length()-1);
        }
    }
}
