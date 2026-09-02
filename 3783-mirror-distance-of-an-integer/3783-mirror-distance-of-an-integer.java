class Solution {
    public int mirrorDistance(int n) {
        int s=0;
        int n1=n;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return Math.abs(n1-s);
    }
}