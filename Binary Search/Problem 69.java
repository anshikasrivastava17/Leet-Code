/* Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. */
 
class Solution {
    public int mySqrt(int n) {
      if (n == 0 || n == 1) 
            return n;

        long start = 1, end = n/2;
        long result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            
            if (mid * mid == n) // perfect square
                return (int) mid;
            else if (mid * mid < n) { //mutiplication we did is smaller so to enlarge it
                start = mid + 1;
                result = mid;  //square root of 4,5,6,7,8 all are 2 until next perfect square
            } else {
                end = mid - 1;
            }
        }
        return (int) result;
    }
}

//Method - 2
/*class Solution {
    public int mySqrt(int x) {
      int d = (int)Math.sqrt(x);
      return d;  
    }
} */
