class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r =  n-1;
        int k = n-1;
        int[] arr = new int[n];

        while(l<=r){

            if(Math.abs(nums[r])> Math.abs(nums[l])){
                arr[k] = nums[r] * nums[r];
                r--;
            }
            else{
                arr[k] = nums[l] * nums[l];
                l++;
            }
            k--;
        }
        return arr;
    }
}