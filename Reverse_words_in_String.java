//Return a string of the words in reverse order concatenated by a single space.

class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("\\s+");
        int i=0;int j=str.length-1;
        while(i < j){
            String temp=str[j];
            str[j]=str[i];
            str[i]=temp;
            i++;
            j--;
        }
        // String ans=Arrays.toString(str);
        String ans="";
        for(int k=0;k<str.length;k++){
            ans=ans+str[k]+" ";
        }
        while((ans.charAt(ans.length()-1))== ' '){
        ans= ans.substring(0,ans.length()-1);}
        return ans;
    }
}
