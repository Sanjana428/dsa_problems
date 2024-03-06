// find index of subarray with given sum

//Given an unsorted array A of size N that contains only non negative integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> li=new ArrayList<>();
        int sum=0;
        int left=0;
        int right=0;
        
        while(right<arr.length){
            sum=sum+arr[right];
            while(sum > s && left<right){
                sum=sum-arr[left];
                left++;
            }
            if(sum==s){
                li.add(left+1);
                li.add(right+1);
                return li;
            }
            right++;
            
        }
        li.add(-1);
        return li;
}
    
}
