class Solution {
    public int[] runningSum(int[] nums) {

        // nums = [1 2 3 4]
        int[] res = new int[nums.length];
        res[0] = nums[0];
        int k=1;

        for(int i=1;i<nums.length;i++){  
            res[k] = nums[i]+nums[i-1]; 
            nums[i] = res[k];  
                                       
            k++;

        }
        return res;
    }
}