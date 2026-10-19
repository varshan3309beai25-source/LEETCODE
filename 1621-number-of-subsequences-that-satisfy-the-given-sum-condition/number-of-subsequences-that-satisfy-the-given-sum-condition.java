class Solution {
    public int numSubseq(int[] nums, int target) {
        
        Arrays.sort(nums);

        int n = nums.length;

        int ans = 0;

        int[] p = new int[n];
        p[0] = 1;

        int MOD = 1_000_000_007;
        for(int i=1;i<n;i++){
            p[i] = (int) (( 2L * p[i-1])% MOD);
        }

        int l = 0;
        int r = n-1;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans = (int) ((ans + (long) p[r-l]) % MOD);
                l++;
            }
            else{
                r--;
            }
        }
        return ans;


    }
}