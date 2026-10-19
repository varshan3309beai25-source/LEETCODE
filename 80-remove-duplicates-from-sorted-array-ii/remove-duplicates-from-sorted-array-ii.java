class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 2;

        int s = 2;

        while(s<nums.length){

            if(nums[s]!=nums[k-2]){
                nums[k] = nums[s];
                k++;
            }
            s++;
        }
        return k;
    }
}