class Solution {
    public int removeDuplicates(int[] nums) {
        

        int s = 1;
        int f = 1;

        while(f<nums.length){

            if(nums[f] != nums[s-1]){
                nums[s] = nums[f];
                s++;
            }

            f++;
        }

        return s;
    }
}