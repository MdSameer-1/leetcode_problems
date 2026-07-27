class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i+=2){
            c+=nums[i];
        }
        return c;
    }
}