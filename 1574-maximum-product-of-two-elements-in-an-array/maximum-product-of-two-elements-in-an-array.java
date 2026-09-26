class Solution {
    public int maxProduct(int[] nums) {
        

        int n = nums.length;

        int curr = nums[0];

        int res = 0;

        for(int i=1;i<n;i++){

            res = Math.max(res, (nums[i]-1) *(curr-1));

            curr= Math.max(curr,nums[i]);
        }

        return res;
        
    }
}