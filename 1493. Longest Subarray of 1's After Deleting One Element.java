class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ++count;
            }
            while(count>1){
                if(nums[left]==0){
                    --count;
                }
                ++left;
            }
            max=Math.max(max,i-left+1);
        }
        return max-1;
        
    }
}