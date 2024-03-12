// longest consecutive sequence

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        int longest_length=0;
        for(int i=0;i<nums.length;i++){
             hm.put(nums[i],false);
        }
        for(int i=0;i<nums.length;i++){
            int current_length=1;
            int nextint=nums[i]+1;
            while(hm.containsKey(nextint) && hm.get(nextint)==false){
                current_length++;
                hm.put(nextint,true);
                nextint++;
            }
            int prevint=nums[i]-1;
            while(hm.containsKey(prevint) && hm.get(prevint)==false){
                current_length++;
                hm.put(prevint,true);
                prevint--;
            }
            longest_length=Math.max(current_length,longest_length);
        }
        return longest_length;
    }
}
