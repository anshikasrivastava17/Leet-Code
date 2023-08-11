/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Solution 1- */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int c=1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            if(nums[i]==nums[j])
                c++;
            }
            if(c>=2)
            return true;
            c=1;
             }
            return false; 
        }  
    }



/*Solution2- more optimized and lesser time complexity */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; 
            }
        }
        return false; 
    }
}
