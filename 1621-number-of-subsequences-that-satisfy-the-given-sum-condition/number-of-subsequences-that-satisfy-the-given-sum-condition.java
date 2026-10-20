class Solution {
    public int numSubseq(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int[] p = new int[n];
        int mod = 1_000_000_007;
        int ans = 0;

        p[0] = 1;
        for(int i=1;i<n;i++){
            p[i] = (int) ((2L * p[i-1])%mod);
        }

        int s=0;
        int e=n-1;
        while(s<=e){
            if(nums[s] + nums[e] <= target){
                ans = (int) ((ans + (long) p[e-s]) % mod);
                s++;
            }
            else{
                e--;
            }
        }
        return ans;
    }
}