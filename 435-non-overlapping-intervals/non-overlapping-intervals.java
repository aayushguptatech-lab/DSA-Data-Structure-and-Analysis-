class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sort on the basis of start
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int cs = 0;
        int ce = 1;
        int ns = 0;
        int ne = 1;

        int count = 0;
        int i=0; int j=1;
        while(i<intervals.length && j<intervals.length){
            if(intervals[i][ce]>intervals[j][ns]){
                count++;
                if(intervals[i][ce]<=intervals[j][ne]){
                    j++;
                }else{
                    i=j;
                    j++;
                }
            }
            else{
                i=j;
                j++;
            }
        }   
        return count;
    }
}