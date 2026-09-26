class Solution {
    public int maxProduct(int[] nums) {

            int n = nums.length;

            int f_m = 0;
            int s_m = 0;

            for(int i=0;i<n;i++){
                if(nums[i]>f_m){
                    s_m = f_m;
                    f_m = nums[i];
                }

                else{
                    s_m = Math.max(s_m,nums[i]);
                }
            }

            return (f_m-1)*(s_m-1);


    }
}