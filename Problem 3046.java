/* You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
nums1.length == nums2.length == nums.length / 2.
nums1 should contain distinct elements.
nums2 should also contain distinct elements.
Return true if it is possible to split the array, and false otherwise. */


//logic used - array can be split into 2 arrasys of distinct elements only if every element has frequency of 2, so that it can be placed in different arrays. 
// But if freq > 2 then we cannot place in different arrays such that every array has distinct elements 
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (nums[i] == -1) {
                continue;
            }
            int c = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j])
                c++;
            }
            if(c>2) //if freq greater than 2 then distinct not possible
                return false;
            for (int j = i; j < i + c; j++) {
                nums[j] = -1;           
            }
        }
        return true;   
    }
}
