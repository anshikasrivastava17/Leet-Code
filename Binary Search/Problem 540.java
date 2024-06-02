/* You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space. */

//If log n restriction wasnt there then xor operation could find non duplicate element.


//Logic used - [1,1,2,3,3,4,4] for every even index, duplicate is on its right and for every odd index duplicate is on its left.
class Solution {
    public int singleNonDuplicate(int[] arr) {
         int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

        if(mid == 0 || mid == arr.length - 1 || (arr[mid] != arr[mid+1])&& (arr[mid]!=arr[mid-1]))
            return arr[mid];
             

             if(mid%2 == 0){  // even index so --> required index on right side
                if( arr[mid] == arr[mid+1] ) //means till here pairs are correct
                    start = mid + 1;

                else if(arr[mid-1] == arr[mid] ) //even ke left me odd obtained so required index on left side
                    end = mid;
            }

            else{   //mid is odd index
                
               if( arr[mid-1] == arr[mid] ) //checked on left & obtained means correct pairing
                    start = mid + 1;

                else if(arr[mid+1] == arr[mid] )
                    end = mid;             
            }
        }
        return -1;
    }
    }

 
