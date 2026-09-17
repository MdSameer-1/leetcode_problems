class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;int k=0;
        for(int i=1;i<=arr.length;i+=2){
            for(int j=0;j+i<=arr.length;j++){
                for(k=0;k<i;k++){
                    s+=arr[j+k];
                }
            }
        }
        return s;
    }
}