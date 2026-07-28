class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] arr=new int[nums.length];
        int e=0,o=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2==0){
                arr[i]=o;
                e++;
            }
            else{
                arr[i]=e;
                o++;
            }
        }
        return arr;
    }
}