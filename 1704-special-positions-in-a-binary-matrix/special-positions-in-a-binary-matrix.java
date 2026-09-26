class Solution {
    public int numSpecial(int[][] mat) {
        

        int m = mat.length;
        int n = mat[0].length;

        int[] rowc = new int[m];
        int[] colc = new int[n];
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(mat[i][j] ==1){
                    rowc[i]++;
                    colc[j]++;
                }
            }
        }

        int res = 0;

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){

                if(mat[r][c] == 1){
                    if(rowc[r]== 1 && colc[c] == 1){
                    res++;
                }
                }
            }
        }

        return res;
    }
}