class Solution {
    public boolean isSameAfterReversals(int num) {
        int s=0;
        int n=num;
        while(num>0){
            int r=num%10;
            s=s*10+r;
            num/=10;
        }
        int s1=0;
        while(s>0){
            int r=s%10;
            s1=s1*10+r;
            s/=10;
        }
        if(s1==n)return true;
        else return false;
    }
}