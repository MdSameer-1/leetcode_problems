class Solution {
    public int subtractProductAndSum(int n) {
        int n1=n;
        int n2=n;
        int m=1,s=0;
        while(n1>0){
            int r=n1%10;
            m*=r;
            s+=r;
            n1/=10;
        }
        return m-s;
    }
}