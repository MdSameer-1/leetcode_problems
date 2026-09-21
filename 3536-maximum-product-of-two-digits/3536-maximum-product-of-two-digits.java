class Solution {
    public int maxProduct(int n) {
        int c=0,c1=0,c2=0;
        String s=String.valueOf(n);
        if(s.length()==2){
            return (s.charAt(0)-'0')*(s.charAt(1)-'0');
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')>=c1){
                c2=c1;
                c1=s.charAt(i)-'0';
                
            }
            else if((s.charAt(i)-'0')>c2&&(s.charAt(i)-'0')<c1){
                c2=s.charAt(i)-'0';
            }
        }
        return c1*c2;
    }
}