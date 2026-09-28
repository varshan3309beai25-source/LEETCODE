class Solution {
    public int removeElement(int[] nums, int val) {
        

        int s = 0;
        int f = 0;
        int c = 0;

        while(f<nums.length){

            if(nums[f]!=val){

                nums[s] = nums[f];
                c++;
                s++;
            }

            f++;
        }

        return c;
    }
}