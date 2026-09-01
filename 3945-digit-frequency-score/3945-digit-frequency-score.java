class Solution {
    public int digitFrequencyScore(int n) {
        int[] ha=new int[10];
        String s=String.valueOf(n);
        int s1=0;
        for(int i=0;i<s.length();i++){
            ha[s.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            s1+=ha[i]*i;
        }
        return s1;
    }
}