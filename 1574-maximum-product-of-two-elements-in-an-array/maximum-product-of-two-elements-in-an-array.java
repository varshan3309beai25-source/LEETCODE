class Solution {
    public int maxProduct(int[] nums) {
        

        int n = nums.length;

        int fmax = -1;
        int smax = -1;

        for(int i=0;i<n;i++){
            if(nums[i]>fmax){
                smax = fmax;
                fmax = nums[i];
            }
            else {
                smax = Math.max(smax,nums[i]);
            }
            
        }
        return ( fmax-1) * (smax-1);
        
    }
}