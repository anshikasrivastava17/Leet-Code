/*Given an integer array nums, find the subarray with the largest sum, and return its sum. */
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
	    int pA=0, maxSum=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
            pA=Math.max(nums[i],pA+nums[i]);
            maxSum=Math.max(maxSum,pA);
        }
        return maxSum;
	}
}
