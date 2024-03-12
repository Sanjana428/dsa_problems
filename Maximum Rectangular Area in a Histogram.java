// Maximum Rectangular Area in a Histogram
//iterate on whole height and for each we find just next smallest in right as well as left for this we use 2 function to calculate next smallest element in right and next smallest element in left by using stack

 class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] sryt=fun1(heights,n);
        int[] sleft=fun2(heights,n);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int ht=heights[i];
            int x1=sryt[i]-1;
            int x2=sleft[i]+1;
            int wd=x1-x2+1;
            int area=ht*wd;
            ans=Math.max(area,ans);
        }
        return ans;
    }

    public int[] fun1(int arr[], int n) 
	{ 
	    // Your code goes here
	    int[] arr1=new int[n];
	    Stack<Integer> st=new Stack<>();
	    for(int i=0;i<n;i++){
	        while(st.size()>0 && arr[st.peek()] > arr[i]){
	            arr1[st.peek()]=i;
	            st.pop();
	        }
	        st.push(i);
	    }
	    while(st.size()>0){
	        int idx=st.pop();
	        arr1[idx]=n;
	    }
	    return arr1;
	} 
    public int[] fun2(int arr[] ,int n)
    {
        //code here
         int[] arr1=new int[n];
	    Stack<Integer> st=new Stack<>();
	    for(int i=n-1;i>=0;i--){
	        while(st.size()>0 && arr[st.peek()] > arr[i]){
	            arr1[st.peek()]=i;
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


// Optimal Aprroach

// doesnt affect on time complexity and space complexity but we reduce number of for loops i.e we did this in a single for loop 

class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long ans=0;
        Stack<Long> st=new Stack<>();
        long temp=0;
        long x2=0;
        for(long i=0;i<=n;i++){
            if(i==n)temp=0;
            else temp=hist[(int) i];
            while(st.size() > 0 && temp < hist[st.peek().intValue()]){
                long tbs=st.pop();
                long x1=i-1;
                if(st.size()==0)  x2=-1;
                else x2=st.peek();
                long xx=x2+1;
                long wi=x1-xx+1;
                long area= hist[(int) tbs] * wi;
                ans=Math.max(ans,area);
            }
            st.push(i);
        }
        return ans; 
    }
        
}

