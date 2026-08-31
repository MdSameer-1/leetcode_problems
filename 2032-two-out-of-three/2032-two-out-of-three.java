class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> arr=new ArrayList<>();
       // HashSet<Integer> set1=new HashSet<>();
         HashSet<Integer> set2=new HashSet<>();
          HashSet<Integer> set3=new HashSet<>();
          for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
          }
          for(int i=0;i<nums3.length;i++){
            set3.add(nums3[i]);
          }
          for(int i=0;i<nums1.length;i++){
            if(set2.contains(nums1[i])&&!arr.contains(nums1[i])){
                arr.add(nums1[i]);
            }
            if(set3.contains(nums1[i])&&!arr.contains(nums1[i])){
                arr.add(nums1[i]);
            }
          }
          for(int i=0;i<nums2.length;i++){
            if(set3.contains(nums2[i])&&!arr.contains(nums2[i])){
                arr.add(nums2[i]);
            }
          }
          return arr;
    }
}