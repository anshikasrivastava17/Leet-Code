/* Given an integer array nums, find the subarray with the largest sum, and return its sum. */

class Solution {
    int maxCrossSum(int arr[], int l, int m, int r) 
    {
    int sum = 0;
    int left_sum = Integer.MIN_VALUE;
    for (int i = m; i >= l; i--)  //from middle towards left
    { 
        sum += arr[i];
        if (sum > left_sum)
        left_sum = sum;
    }
    sum = 0;
    int right_sum = Integer.MIN_VALUE;
    for (int i = m + 1; i <= r; i++) //from middle toward right
    {
        sum += arr[i];
        if (sum > right_sum)
        right_sum = sum;
    }
    return left_sum + right_sum;  //max sum across midpt. 
}

int maxSubarray(int arr[], int l, int r) {
    if (l == r) {
        return arr[l];   //single element left
    }

    int m = l + (r - l) / 2; 
    int maxLeftSum = maxSubarray(arr, l, m);
    int maxRightSum = maxSubarray(arr, m + 1, r);
    int maxCrossing = maxCrossSum(arr, l, m, r);
    return Math.max(Math.max(maxLeftSum, maxRightSum), maxCrossing);  //max of all three sums
}
   
    public int maxSubArray(int[] nums) {
         int maxSum = maxSubarray(nums, 0, nums.length - 1);
         return maxSum;
    }
}
