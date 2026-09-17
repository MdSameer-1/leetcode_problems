class Solution {
    public int totalMoney(int n) {
        int c=1;
        int s=0;
        if(n<=7){
            for(int i=0;i<n;i++){
                s+=(i+1);
            }
        }
        else{
            int v=0;
            while(n>0){
            for(int i=0;n>0&&i<7;i++){
                s+=(i+1+v);
                n--;
            }
            v++;
            }

        }
        return s;
    }
}