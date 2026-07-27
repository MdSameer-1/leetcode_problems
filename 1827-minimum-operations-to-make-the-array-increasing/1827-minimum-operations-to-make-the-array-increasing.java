class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int d=0;
            if(nums[i]>=nums[i+1]){
                d=nums[i]-nums[i+1]+1;
                c+=d;
                nums[i+1]+=d;
            }
        }
        return c;
    }
}