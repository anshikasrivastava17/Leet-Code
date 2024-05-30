/* A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time. */

//same as Problem 852

lass Solution {
    public int findPeakElement(int[] arr) {
        
        int start = 0, end=arr.length-1;
        int ans = binarySearch(arr,start,end);
        return ans;
    }

      static int binarySearch(int[] arr, int start, int end) {
        while(start != end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid+1] ){
                end = mid;
        }
       
    }
     return start;   //or return end since when loop ends both point to same number
}
}
