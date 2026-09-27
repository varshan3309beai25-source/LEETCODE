class Solution {
    public int numSpecial(int[][] mat) {
        

        int row = mat.length;
        int col = mat[0].length;
        int[] row_c =new int[row];
        int[] col_c = new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){


                if(mat[i][j] == 1){
                    row_c[i]++;
                    col_c[j]++;
                }
            }
        }


        int res = 0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){


                if( mat[i][j] == 1 && row_c[i] ==1 && col_c[j] == 1){

                    res++;
                }
            }
        }

        return res;

        
    }
}