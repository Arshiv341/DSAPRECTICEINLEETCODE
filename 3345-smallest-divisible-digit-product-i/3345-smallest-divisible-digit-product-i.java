class Solution {
    public static int prod(int n){
        int p=1;
        while(n>0){
            p*=n%10;
            n=n/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int x =prod(n);
            if(x%t!=0){
               n++;
            }
            else{
                break;
            }
        }
        return n;
    }
}