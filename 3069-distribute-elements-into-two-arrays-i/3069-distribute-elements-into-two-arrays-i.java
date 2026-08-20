class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int l1=1,l2=1;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(l1-1)>arr2.get(l2-1)){
                arr1.add(nums[i]);
                l1++;
            }
            else{
                arr2.add(nums[i]);
                l2++;
            }
        }
        int l=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<arr1.size();i++){
            arr[l++]=arr1.get(i);
        }
        for(int i=0;i<arr2.size();i++){
            if(l>=nums.length)break;
            arr[l++]=arr2.get(i);
        }
        return arr;
    }
}