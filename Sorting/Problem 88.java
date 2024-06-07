/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n. */

class Solution {
    public void merge(int[] first, int m, int[] second, int n) {
        if(n == 0) return;
        int[] mix = new int[first.length + second.length];
    
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (first[i] < second[j]) 
                mix[k++] = first[i++];
            else 
                mix[k++] = second[j++];
        }

       for( ; i < m; i++) 
            mix[k++] = first[i];

         for( ; j < n; j++) 
            mix[k++] = second[j];

        for (int l = 0; l < m+n; l++) {
            first[l] = mix[l];
        }
    }      
}
