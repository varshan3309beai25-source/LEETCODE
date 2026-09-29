class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
            // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            // Output: [1,2,2,3,5,6]

            // s = 2
            // e = 2
            // res = {0,0,0,0,0,0}
            // k = 5

        int s = m-1;                          
        int e = n-1;
        int[] res = new int[m+n];
        int k = res.length-1;

        while(s>=0 && e>=0){       // s = 2,1 >=0  e=2,1>=0 //s=2 ,e=2      s=2 ,e=1  s=2,e=0 ||  s=2 ,e=0 true|| s=1,e=0 true|| s=0 e=0 true|| s=0 ,e-1; false
 
            if(nums1[s]<nums2[e]){  // nums1[2] = 3 < nums2[2] = 6 true || nums1[2] < nums2[1] == 3<5 true|| nums1[2] <nums2[0] 3<2 false || nums1[0]<nums2[0] 1<2 true

                res[k] = nums2[e];  // res[5] = nums2[2] = 6  || res[4] = nums2[1] = 5,6 || res[1] = nums2[0] =  2,2,3,5,6
                 e--;  //e=1 || e=0 || e=-1
            }

           else{
             res[k] = nums1[s];  // res[3] = nums1[2] = 3,5,6|| res[2] = nums1[1] = 2,3,5,6
                s--; //s=1  , s=0
           }
            k--; //k=4 ,k=3 , k=2 , k=1 ,k=0
            
        }

        // s=0
        // e=-1
        //k=0  res = {0,2,2,3,5,6}

        while(s>=0){  //s=0>=0 true

            res[k] = nums1[s];  //res[0] = nums1[0] = 1,2,2,3,5,6
            s--; //s=-1
            k--; //k=-1
        }

        while(e>=0){  //e=-1>=0 false not run

            res[k] = nums2[e];
            e--;
            k--;
        }

        //res = [1,2,2,3,5,6]

        for(int i=0;i<m+n;i++){  //i=0 to i=5
                nums1[i] = res[i];  //nums1[0] = res[0] = nums1 = [1,2,2,3,5,6]
            }
    }
}