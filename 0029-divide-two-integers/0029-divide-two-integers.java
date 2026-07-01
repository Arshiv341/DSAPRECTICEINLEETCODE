class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long n =Math.abs((long)dividend);
        long k =Math.abs((long)divisor);
        int q=0;
        for(int i=31;i>=0;i--){
            if((k<<i)<=n){
                n-=(k<<i);
                q|=(1<<i);
            }
        }
        if((dividend<0)^(divisor<0)){
            q=-q;
        }
        return q;
    }
}