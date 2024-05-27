/* Given an array nums of integers, return how many of them contain an even number of digits. */

 //Method 1 - count by conventional while loop method
//Method 2 - use Math.log to count number of digits

class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int d = digits(nums[i]);
            if(even(d))
            c++;
        }
        return c;
    }

    static int digits(int n){  //M-2 instead of counting like this use 'return (int)(Math.log10(n)) + 1; '  in place of whole function
        int d=0;
        while(n!=0){
            d++;
            n/=10;
        }
        return d;
    }

    static boolean even(int n){
        if(n%2==0) return true;
        else return false;
    }
}
