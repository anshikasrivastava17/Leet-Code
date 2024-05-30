/* An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity. */

//mountain array first rises then falls, we have to find peak. Peak is max number 

/* Given code finds peak but uses O(n) complexity
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0],j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
            max = arr[i]; j=i;}
        }
        return j;
    }
} */
