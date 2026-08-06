class Solution {
    static int con(char c){
        switch(c){
                case 'I':
                return 1;
                case 'V':
                return 5;
                case 'X':
                return 10;
                case 'L':
                return 50;
                case 'C':
                return 100;
                case 'D':
                return 500;
                case 'M':
                return 1000;
                default:
                return 0;
    }
    }

    public int romanToInt(String s1) {
        int s=0;int i=0;
        for( i=0;i<s1.length()-1;i++){
            char c=s1.charAt(i);
            char c1=s1.charAt(i+1);
            int a=con(c);
            int b=con(c1);

            if(a>=b){
                s+=a;
            }
            else{
                int k=b-a;
                s+=k;
                i++;
            }
    }
    if(i<=s1.length()-1){
        s+=con(s1.charAt(i));
    }
    return s;
}}