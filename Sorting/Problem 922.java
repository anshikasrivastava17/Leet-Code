/* Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition. */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length){
            while(i < nums.length && nums[i] % 2 == 0)
            {
                i+=2;
            }
             while(j < nums.length && nums[j] % 2 == 1)
            {
                j+=2;
            }
            if(i < nums.length && j < nums.length ){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;     
    }
}
