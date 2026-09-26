class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int current_max = nums[0];

        int result = 0;

        for(int i=1;i<n;i++){

          result = Math.max(result, (nums[i]-1)*(current_max-1));

            current_max = Math.max(nums[i],current_max);
        }

        return result;
    }
}