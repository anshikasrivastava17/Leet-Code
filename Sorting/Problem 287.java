/* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space. */

//Range 1 to N so cycle sort 

 

class Solution {
    public int findDuplicate(int[] nums) {
       sort(nums);
       int a = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=i+1)  //value = index + 1
        {
        a = nums[i] ; break; }
       } 
       return a;
    }

    void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) 
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
