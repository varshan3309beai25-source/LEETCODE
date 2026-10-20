class Solution {
    public int[] sortArrayByParity(int[] nums) {
        

        int s = 0;
        int k = 0;
        int[] arr = new int[nums.length];

        while(s<nums.length){

            if(nums[s] % 2 == 0){
                arr[k] = nums[s];
                k++;
                
                
            }
            s++;
           
            
    }
    s = 0;
        while(s<nums.length){
            if(nums[s] % 2!=0){
                arr[k] = nums[s];
                k++;
                
            }
            s++;

            
        }
        return arr;
    }
}