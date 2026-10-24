class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int sifts=0;
        while(left<right){
            left=left>>1;
            right=right>>1;
            sifts++;
        }
        return left<<sifts;
    }
}