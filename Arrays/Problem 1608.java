/* You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
Notice that x does not have to be an element in nums.
Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique. */

class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length; 
        for(int i=0;i<=n;i++){
            int c = 0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]>=i)
                c++;
            }
            if(c==i)
            return i;
        }
        return -1;
    }
}
