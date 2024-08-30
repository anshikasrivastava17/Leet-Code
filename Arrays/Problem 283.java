class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0; 
        // Pointer for the position to place the next non-zero element
        
        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        
        // Fill the rest of the array with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
