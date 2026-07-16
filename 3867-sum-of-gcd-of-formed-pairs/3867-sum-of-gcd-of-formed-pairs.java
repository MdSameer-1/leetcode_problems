import java.util.Arrays;
class Solution {
    public long gcdSum(int[] nums) {
        int[] ma=new int[nums.length];
        long s=0;
        ma[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ma[i]=Math.max(ma[i-1],nums[i]);
        }
        int[] g=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            g[i]=gcd(nums[i],ma[i]);
        }
        Arrays.sort(g);
        int l=0,r=g.length-1;
        while(l<r){
            s+=gcd(g[l],g[r]);
            l++;r--;
        }
        return s;
    }
    public static int gcd(int a, int b){
    while(b != 0){
        int t = b;
        b = a % b;
        a = t;
    }
    return a;
}
}