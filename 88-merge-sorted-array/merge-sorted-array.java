class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int e1 = m-1;
        int e2 = n-1;

        int k = m+n -1;
        

        while(e1>=0 && e2>=0){

            if(nums1[e1]<nums2[e2]){

                nums1[k] = nums2[e2];
                e2--;

            }
            else{

                nums1[k] = nums1[e1];
                e1--;
            }

            k--;
        }

        while(e2>=0){

            nums1[k] = nums2[e2];
            e2--;
            k--;
        }


    }
}