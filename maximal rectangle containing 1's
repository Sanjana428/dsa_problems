//Maximal Rectangle
// follow up of maximum area rectangle in a histogram

//Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] ans=new int[matrix[0].length];
        int fin=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0){
                    ans[j]=matrix[i][j]-'0';
                }
                else{
                    if(matrix[i][j]=='1'){
                        ans[j]+=matrix[i][j]-'0';
                    }
                    else{
                        ans[j]=0;
                    }
                }

            }
            fin=Math.max(fin,largesthist(ans));
        }
        return fin;
    }
    public int largesthist(int[] arr){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        int temp=0;
        int x2=0;
        for(int i=0;i<=arr.length;i++){
            if(i==arr.length){temp=0;}
            else{temp=arr[i];}
            while(st.size()>0 && arr[st.peek()]>temp){
                int tbs=st.pop();
                int x1=i-1;
                if(st.size()==0){ x2=0;}
                else x2=st.peek()+1;
                int area=arr[tbs]*(x1-x2+1);
                ans=Math.max(ans,area);
            }
            st.push(i);

        }
        return ans;
    }
}
