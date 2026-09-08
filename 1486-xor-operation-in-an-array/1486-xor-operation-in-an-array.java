class Solution {
    public int xorOperation(int n, int start) {
        int s=0;
        for(int i=0;i<n;i++){
           int s1=start+2*i;
           s^=s1;
        }
        return s;
    }
}