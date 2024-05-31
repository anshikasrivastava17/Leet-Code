/* There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity */


class Solution {
     int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // no pivot, it means the array is not rotated so normal binary search
        if (pivot == -1) 
            return binarySearch(nums, target, 0 , nums.length - 1);

        if (nums[pivot] == target) 
            return pivot;

        if (target >= nums[0]) 
            return binarySearch(nums, target, 0, pivot - 1);

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else 
                return mid;
        }
        return -1;
    }

    // this will not work in duplicate values
        int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases 
            if (mid < end && arr[mid] > arr[mid + 1]) 
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) 
                return mid-1;
            if (arr[mid] <= arr[start]) 
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return -1;
    }
}
