class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sts=new Stack<>();
        Stack<Character> stt=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')sts.push(s.charAt(i));
            else if(!sts.isEmpty()&&s.charAt(i)=='#')sts.pop();
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)>='a'&&t.charAt(i)<='z')stt.push(t.charAt(i));
            else if(!stt.isEmpty()&&t.charAt(i)=='#')stt.pop();
        }
        if(sts.size()!=stt.size())return false;
        int n=sts.size();
        for(int i=0;i<n;i++){
            if(sts.pop()!=stt.pop())return false;
        }
        return true;
    }
}