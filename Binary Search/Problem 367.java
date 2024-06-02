/* Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt. */

class Solution {
    public boolean isPerfectSquare(int x) {
         if(x==0 || x==1){
            return true;
        }
        long start=1;
        long end=x/2;
        long result=0;

        while(start<=end){
            long mid=start + (end-start)/2;
            if(mid*mid==x){
                return true;
            }
            else if(mid*mid<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
