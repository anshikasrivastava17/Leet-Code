/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. */

//given below is with O(n) complexity
/* class Solution {
    public int[] searchRange(int[] arr, int target) {
        int c = 0;
        int nums[]=new int[2];
     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            c++;
     }
    }
    if(c==0){
        nums[0]=-1;
        nums[1]=-1;
        return nums;
    }
    else{
     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            nums[0]=i;
            break;
        }
     }
     nums[1]=nums[0]+(c-1);
     return nums;
    }
    }
}   */


class Solution {
    public int[] searchRange(int[] arr, int target) {
       int []ans = {-1,-1};
       int start = search(arr,target,true);
       int end = search(arr,target,false);
       ans[0]=start;
       ans[1]=end;
       return ans;
    }


    int search(int[] arr, int target, boolean first_index) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {   //we come in here only when target==arr[mid] ie. whenever target is found
                // potential ans found
                ans = mid;
                if(first_index)  //left subarray
                end = mid - 1;
                else //last occurence -> right subarray
                start = mid + 1;
            }
        }
        return ans;
    }
}
