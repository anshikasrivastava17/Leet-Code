/* You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|. */

 
class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0 , dSum = 0;
        for(int i = 0;i<nums.length; i++)
        {
            eSum+=nums[i];
            while(nums[i]!=0)
            {
                int r = nums[i] % 10;
                dSum += r;
                nums[i]/=10;
            }
        }
        return Math.abs(eSum - dSum);
    }
}
