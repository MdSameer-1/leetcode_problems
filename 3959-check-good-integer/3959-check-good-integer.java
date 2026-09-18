class Solution {
    public boolean checkGoodInteger(int n) {
        int n1=n,ds=0,ss=0;
        while(n1>0){
            int r=n1%10;
            ds+=r;
            ss+=(r*r);
            n1/=10;
        }
       boolean s= (ss-ds>=50)?  true: false;
       return s;
    }
}