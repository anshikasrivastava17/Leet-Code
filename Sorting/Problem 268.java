/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array. */
//Brute Force - sort then
       /* int a=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=a)
        break;
        a++;
    }
    return a;  */

//range ques 0 to N so cycle sort
class Solution {
    public int missingNumber(int[] nums) {
        sort(nums); 
        int j=nums.length; //because the number missing could be last number, eg [0,1] missing 2
        for(int i=0;i<nums.length;i++){
        if(nums[i]==i)
        continue;
        else{
        j = i;
        break; }
        }
        return j;
    }
  
    void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]; //index = value for 0 to n ranged
            if (arr[i]!=arr.length && arr[i] != arr[correct]) 
                swap(arr, i , correct);
            else 
                i++;    
        }
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
    
