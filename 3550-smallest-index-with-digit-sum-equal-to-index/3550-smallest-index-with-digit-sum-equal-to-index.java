class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            if(s.length()==1){
                if(Integer.parseInt(s)==i)return i;
            }
            else{
                int t=0;
                for(int j=0;j<s.length();j++){
                    t+=(s.charAt(j)-'0');
                    if(t>i)break;
                }
                if(t==i)return i;
            } 
        }
        return -1;
    }
}