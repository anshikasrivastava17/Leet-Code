/* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums. */
  
class Solution {
    public int[] runningSum(int[] nums) {
        int [] arr = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length; i++)
        {
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
