class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        int s = 0;
        int e = 0;
        ArrayList<int[]> res = new ArrayList<>();
        

        while(s<firstList.length && e<secondList.length){

            int start = Math.max(firstList[s][0],secondList[e][0]);
            int end = Math.min(firstList[s][1], secondList[e][1]);

            if(start<=end){

                res.add(new int[]{start,end});
            }

            if(firstList[s][1]<secondList[e][1]){

                s++;
            }
            else{
                e++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}