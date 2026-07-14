class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
    public static void rev(char[] s,int left,int right){
        if(left>=right) return;
        char ch=s[left];
        s[left]=s[right];
        s[right]=ch;
        rev(s,left+1,right-1);
    }
}