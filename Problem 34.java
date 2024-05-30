/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. */


//given below is with O(n) complexity
class Solution {
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

}
