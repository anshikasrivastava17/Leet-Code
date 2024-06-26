/* Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers. */
class Solution {
    public int findGCD(int[] nums) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, n;
        for(int i=0;i<nums.length;i++)
        {
            n = nums[i];
            if (n > max1) 
                max1 = n;

            if (n < min1) 
                min1 = n;  
        }
        int a = gcd(max1,min1);
        return a;
        }
        static int gcd(int a, int b)
        {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
        }
    }
