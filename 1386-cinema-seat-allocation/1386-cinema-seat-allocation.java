class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int k=0;
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            int r=reservedSeats[i][0];
            int s=reservedSeats[i][1];
             if (!map.containsKey(r)) {
                map.put(r, new HashSet<>());
            }
            map.get(r).add(s);
        }
        k=(n-map.size())*2;
        for(int r:map.keySet()){
            HashSet<Integer> set=map.get(r);
            boolean l=true;
            boolean m=true;
            boolean ri=true;
            for(int i=2;i<=5;i++){
                if(set.contains(i)){
                    l=false;
                    break;
                }
            }
            for(int i=4;i<=7;i++){
                if(set.contains(i)){
                    m=false;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(set.contains(i)){
                    ri=false;
                    break;
                }
            }
            if(l&&ri)k+=2;
            else if(l||ri||m)k+=1;
        }
        return k;
    }
}