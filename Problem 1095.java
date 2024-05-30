/* (This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array. */


 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int ans = orderAgnostic (mountainArr, target,true,0,peak);
        if(ans == -1)
        ans = orderAgnostic (mountainArr, target,false,peak,MountainArray.length()-1);
        return ans;
    }


    public int findPeakElement(MountainArray arr) {
        
        int start = 0, end= MountainArray.length()-1;
        int ans = binarySearch(arr,start,end);
        return ans;
    }

     i…
[11:50 pm, 30/5/2024] Anshika: /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int ans = orderAgnostic (mountainArr, target,true,0,peak);
        if(ans == -1)
        ans = orderAgnostic (mountainArr, target,true,peak,mountainArr.length()-1);
        return ans;
    }


    public int findPeakElement(MountainArray arr) {
        
        int start = 0, end= arr.length()-1;
        int ans = binarySearch(arr,start,end);
        return ans;
    }

     int binarySearch(MountainArray arr, int start, int end) {
        while(start != end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid+1)) {
                start = mid + 1;
            } else if ( arr.get(mid) > arr.get(mid+1) ){
                end = mid;
        }
       
    }
     return start;   //or return end since when loop ends both point to same number
}
    int orderAgnostic (MountainArray arr, int target,boolean isAsc,int start,int end){
    while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
