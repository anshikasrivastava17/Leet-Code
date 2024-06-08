/* class Solution {Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. */
 
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2]; //appears more than n/2 so we have two halves 
        //1 half will be completely and other half will be partially filled which means 
        //mid is crossed anyway so n/2 gives ans
    }
}
