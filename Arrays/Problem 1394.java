/* Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1. */

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        int n = arr.length;
        int maxLucky = -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == -1) {
                continue;
            }
            int c = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j])
                c++;
            }
            if(c==arr[i])
            {
                maxLucky = Math.max(maxLucky, arr[i]);
            }
            for (int j = i; j < i + c; j++) {
                arr[j] = -1;                   //mark all those counted as -1 for eg. [2,2,2,3,3] count 1st 2 and update c=3 then for remaining 2's mark it as -1.
            }
        }
        
        return maxLucky;
    }
}
