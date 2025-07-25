class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    result.add(i);
                    break;
                }
            }
        }
        
        return result;
    }
}
