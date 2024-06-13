class Solution {
    public int search(int[] arr, int target) {
         int start = 0;
        int end = arr.length - 1;
        return findBS(arr,target,start,end);
        
    }


    int findBS(int[] arr, int target, int s, int e)
    {
        if(s>e)
        return -1;

        int m = s + (e-s)/2;

        if(arr[m]==target)
        return m;

        if(target<arr[m])
        return findBS(arr, target, s, m-1);

        return findBS(arr, target,m+1, e);

    }
}
