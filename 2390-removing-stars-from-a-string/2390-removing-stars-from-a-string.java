class Solution {
    public String removeStars(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() && s.charAt(i)=='*'){
                continue;
            }
            else if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        while(!st.isEmpty()){
            str=st.peek()+str;
            st.pop();
        }
        return str;
    }
}