//Method - 1 , not so optimized
/*
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]==val)
                nums[i]= 51;
            else
            k++;
        }
        Arrays.sort(nums);
        return k;
    }
}  */

//Method -2

class Solution
{
    public int removeElement(int[] nums, int val)
    {
        int i = 0;
        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] != val)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
