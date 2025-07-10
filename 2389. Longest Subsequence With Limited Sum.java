class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        int[] ans=new int[m];
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<m;i++){
            int q=queries[i];

            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==q){
                    ans[i]=mid+1;
                    break;
                }else if(nums[mid]<q){
                    ans[i]=mid+1;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return ans;
        
    }
}