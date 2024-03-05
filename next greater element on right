//next greater element on right

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] arr1=new long[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()] <arr[i] ){
                arr1[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            int idx=st.pop();
            arr1[idx]=-1;
        }
        return arr1;
        
    } 
}
