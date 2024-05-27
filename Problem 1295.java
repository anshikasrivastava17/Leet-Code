/* Given an array nums of integers, return how many of them contain an even number of digits. */

 

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

    static int digits(int n){
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
