class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int l = 0;
        int r = nums.length-1;
        int[] res = new int[nums.length];
        int p = nums.length-1;

        while(r>=l){

        if(nums[l]*nums[l]>nums[r]*nums[r]){

            res[p] = nums[l]*nums[l];
            l++;
            
        }

        else{

            res[p] = nums[r]*nums[r];
            r--;
            
        }

        p--;

        }

        return res;

    }
}