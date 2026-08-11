class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int[] d=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            d[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<d.length;i++){
            if(d[i]!=heights[i])c++;
        }
        return c;
    }
}