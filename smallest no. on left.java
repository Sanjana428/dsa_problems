// smallest number on left

class Solution{
    static List<Integer> leftSmaller(int n, int arr[])
    {
        //code here
         int[] arr1=new int[n];
	    Stack<Integer> st=new Stack<>();
	    for(int i=n-1;i>=0;i--){
	        while(st.size()>0 && arr[st.peek()] > arr[i]){
	            arr1[st.peek()]=arr[i];
	            st.pop();
	        }
	        st.push(i);
	    }
	    while(st.size()>0){
	        int idx=st.pop();
	        arr1[idx]=-1;
	    }
	    List<Integer> li=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        li.add(arr1[i]);
	    }
	    return li;
    }
}
