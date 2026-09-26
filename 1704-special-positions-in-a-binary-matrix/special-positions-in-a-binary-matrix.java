class Solution {
    public int numSpecial(int[][] mat) {
        

        int m = mat.length;
        int n = mat[0].length;

        int res = 0;

        for(int row = 0;row<m;row++){
            for(int col = 0;col<n;col++){

                if(mat[row][col] == 0) continue;

                //column check

                boolean f = true;

                for(int r = 0;r<m;r++){
                    if(r!=row && mat[r][col] ==1){
                        f = false;
                        break;
                    }
                }

                // row check

                for(int c = 0;c<n;c++){
                    if(c!=col && mat[row][c]==1){
                        f = false;
                        break;
                    }
                }


                if(f == true){
                    res++;
                }
            }
        }

        return res;
    }
}