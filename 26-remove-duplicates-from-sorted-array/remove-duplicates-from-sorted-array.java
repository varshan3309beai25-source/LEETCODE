class Solution {
    public int removeDuplicates(int[] nums) {
        
        int s = 1;
        int f = 1;

        while(f<nums.length){
            if(nums[s-1] != nums[f]){
                nums[s] = nums[f];
                s++;
            }
            else{
                f++;
            }
            
        }
        return s;
    
    }
}