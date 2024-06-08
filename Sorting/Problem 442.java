/* Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space. */

// Range 1 to N so cycle sort
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
            ans.add(nums[i]);
        }
        return ans;
    }

     static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) 
                swap(arr, i , correct);
            else 
                i++;    
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
