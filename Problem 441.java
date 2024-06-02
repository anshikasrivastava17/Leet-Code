/* You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build. */

class Solution {
    public int arrangeCoins(int n) {
        long sum = 0, rows=0;
        for(long i=1;i<=n;i++)
        {
            sum = sum + i;
            if(sum>=n){
            rows = i;
            break;
            }
        }
        int c = 0;
       for(int i=1;i<=rows;i++){
        if(n<=0)
        break;
        if(n>=i){
        n=n-i;
        c++;} else n=n-i;

       }
        return c;
        }
}
