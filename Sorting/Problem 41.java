/* Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space. */

//use cycle sort as acc to ques we have to ignore -ve and values greater that length, so it automatically came in range of 1 to N. 

class Solution {
    public int firstMissingPositive(int[] nums) {
        //ignore negatives and elements > length
        sort(nums); 
        int a=nums.length+1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) {
            a = i+1; break; }
        }
        return a;
    }

 void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; //index = value -1 for 1 to n ranged
            if (arr[i] < arr.length && arr[i]>0 && arr[i] != arr[correct]) 
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
