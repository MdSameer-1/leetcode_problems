class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int s=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)%k==0){
                s+=i*map.get(i);
            }
        }
        return s;
    }
}