class Solution {
    public int minimumPushes(String word) {
        if(word.length()<8)return word.length();
        else if(word.length()==8)return 8;
        else if(word.length()>8&&word.length()<=16){
            int s=word.length()-8;
            return 8+s*2;
        }
        else if(word.length()>16&&word.length()<=24){
            int s=word.length()-16;
            int s1=word.length()-8-s;
            return 8+s1*2+s*3;
        }
        else if(word.length()>24){
            int s=word.length()-24;
           // int s1=word.length()-16-s;
            //int s2=word.length()-8-s1;
            return 8+8*2+8*3+s*4;
        }
        return -1;
    }
}