class Solution {
    public int numSubseq(int[] nums, int target) {
        

        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1_000_000_007;
        int ans = 0;

        int[] pow = new int[n];
        pow[0] = 1;

        for(int i=1;i<nums.length;i++){
            pow[i] = (int) ((2L * pow[i-1]) % mod);
        }

        int l = 0;
        int e = n-1;

        while(l<=e){

            if(nums[l]+nums[e]<=target){
                ans = (int) ((ans + (long) pow[e-l]) % mod);
                l++;
            }
            else{
            e--;
            }
        }

        return ans;
    }
}