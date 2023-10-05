/* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.  */

You must solve the problem without modifying the array nums and uses only constant extra space.
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
