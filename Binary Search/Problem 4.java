/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)). */

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2) 
            return findMedianSortedArrays(nums2, nums1);

        int total = n1 + n2;
        int half = (total + 1) / 2; //for both even and odd total

        int start = 0;
        int end = n1;

        var result = 0.0;

        while (start <= end) {
            int Lpart1 = start + (end - start) / 2; //left partition of array1
            int Lpart2 = half - Lpart1;             //left partition of array2

            // get the four points around possible median
            int maxLeftnums1 = (Lpart1  > 0) ? nums1[Lpart1  - 1] : Integer.MIN_VALUE;
            int minRightnums1 = (Lpart1  < n1) ? nums1[Lpart1 ] : Integer.MAX_VALUE;
            int maxLeftnums2 = (Lpart2 > 0) ? nums2[Lpart2 - 1] : Integer.MIN_VALUE;
            int minRightnums2 = (Lpart2 < n2) ? nums2[Lpart2] : Integer.MAX_VALUE;

            // partition is correct
            if (maxLeftnums1 <= minRightnums2 && maxLeftnums2 <= minRightnums1) {
                
                if (total % 2 == 0)  //even
            result = (Math.max(maxLeftnums1, maxLeftnums2) + Math.min(minRightnums1, minRightnums2 )) ;
                        
                else          // odd
                    result = Math.max(maxLeftnums1, maxLeftnums2);

                break;
            }

            // partition is wrong (update left/right pointers)
            else if (maxLeftnums1 > minRightnums2 ) 
                end = Lpart1 - 1;

            else 
                start = Lpart1 + 1;
        }
        return result;
    }
}
