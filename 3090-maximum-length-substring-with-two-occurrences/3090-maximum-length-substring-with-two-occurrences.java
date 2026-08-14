class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>2){
                while(map.get(ch)>2){
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                    j++;
                }
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}