/* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. */

class Solution {
    public int reverse(int x) {
        int n=x,c=0,rev=0;
        while(x!=0)
        {
        int r=x%10;
        if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
        return 0;
        rev=(rev*10)+r;
        x/=10;
        } 
    return rev;
    }
}
