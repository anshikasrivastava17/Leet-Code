/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array. */

class Solution {
    public int missingNumber(int[] nums) {
     for (int i = 0; i < nums.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < nums.length; j++)
            {  
                if (nums[j] < nums[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = nums[index];   
            nums[index] = nums[i];  
            nums[i] = smallerNumber;  
        }  
        int a=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=a)
        break;
        a++;
    }
    return a;
    }  
}
