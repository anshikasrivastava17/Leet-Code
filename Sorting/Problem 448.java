/* Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums. */

//Range 1 to N cycle sort
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
            ans.add(i+1);
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
