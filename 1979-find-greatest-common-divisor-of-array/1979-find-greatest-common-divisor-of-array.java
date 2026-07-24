class Solution {
    public int findGCD(int[] nums) {
        int max=0;int min=2001;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int i=min;i>0;i--){
            if(max%i==0&&min%i==0)return i;
        }
        return 1;
    }
}