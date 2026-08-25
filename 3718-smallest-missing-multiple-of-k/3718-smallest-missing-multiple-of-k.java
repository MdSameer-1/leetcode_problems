class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int s=1;
        while(true){
            int t=s*k;
            if(!set.contains(t)){
                return t;
            }
            s++;
        }
        //return -1;
    }
}