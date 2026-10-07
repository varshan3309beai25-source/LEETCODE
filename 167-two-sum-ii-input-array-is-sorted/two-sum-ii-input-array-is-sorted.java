class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int s = 0;
        int e = numbers.length-1;

        while(s<e){

            int sum = numbers[s]+numbers[e];

            if(sum>target){
                e--;
            }
            if(sum<target){
                s++;
            }
            if(sum == target){
                return new int[]{s+1,e+1};
            }
        }

        return new int[]{};
    }
}