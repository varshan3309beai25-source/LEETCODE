class Solution {
    public int numSubseq(int[] nums, int target) {
        
        Arrays.sort(nums);
        int MOD = 1_000_000_007;
        int ans = 0;
        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i=1;i<n;i++){
            pow[i] = (int) ((2L * pow[i-1])% MOD);
        }
        int l = 0;
        int r = n-1;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans = (int) ((ans + (long) pow[r-l])% MOD);
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}