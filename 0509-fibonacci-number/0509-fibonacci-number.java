class Solution {
    public int fib(int n) {
        int l1=0;
        int l2=1;
        int c=0;
        if(n==1)return 1;
        for(int i=1;i<n;i++){
            c=l1+l2;
            l1=l2;
            l2=c;
        }
        return c;
    }
}