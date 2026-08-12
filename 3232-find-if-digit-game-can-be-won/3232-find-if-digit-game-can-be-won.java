class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0&&nums[i]<=9){
                s+=nums[i];
            }
            else{
                d+=nums[i];
            }
        }
        if(s>d||d>s)return true;
        else return false;
    }
}