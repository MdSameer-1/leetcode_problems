class Solution {
    public int numberOfMatches(int n) {
        int s=0;int r=0,r1=0;
        while(n>1){
            r=0;r1=0;
            if(n%2!=0){
                 r=n/2;
                 r1=n/2;
                r++;
                n=r;
            }
            else{
                r=n/2;
                r1=r;
                n=r; 
            }
            s+=r1;
        }
        return s;
    }
}