/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function. */

class Solution {
    public void sortColors(int[] nums) {
        mergeSortInPlace(nums, 0, nums.length);
    }

    void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) 
            return;
      
        int mid = s + (e - s) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

        void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s, j = m, k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) 
                mix[k++] = arr[i++];      
            else 
                mix[k++] = arr[j++];
        }

        // copy the remaining elements
        for( ; i < m; i++) 
            mix[k++] = arr[i];

        for (; j < e; j++) 
            mix[k++] = arr[j];
        
        for (int l = 0; l < mix.length; l++) 
            arr[s+l] = mix[l];   
    }
}
