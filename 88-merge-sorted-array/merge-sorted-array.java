class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int s = m-1;
        int e = n-1;
        int[] res = new int[m+n];
        int k = res.length-1;

        while(s>=0 && e>=0){

            if(nums1[s]<nums2[e]){

                res[k] = nums2[e];
                e--;
            }

           else{
             res[k] = nums1[s];
                s--;;
           }
            k--;
            
        }

        while(s>=0){

            res[k] = nums1[s];
            s--;
            k--;
        }

        while(e>=0){

            res[k] = nums2[e];
            e--;
            k--;
        }

        for(int i=0;i<m+n;i++){
                nums1[i] = res[i];
            }
    }
}