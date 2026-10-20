class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int s = m-1;
        int e = n-1;
        int k = m+n-1;

        while(s>=0 && e>=0){
            if(nums1[s] > nums2[e]){
                nums1[k] = nums1[s];
                s--;
            }
            else{
                nums1[k] = nums2[e];
                e--;
            }
            k--;
        }
        while(e>=0){
            nums1[k] = nums2[e];
            e--;
            k--;
        }
    }
}