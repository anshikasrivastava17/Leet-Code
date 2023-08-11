/*Given an integer x, return true if x is a palindrome, and false otherwise. */

class Solution {
public:
    bool isPalindrome(int n) {
     if(n<0)
     return false;
     int k=n,rev=0;
     while(n!=0)
     {
    int r=n%10;
    if(rev>INT_MAX/10 || rev<INT_MIN/10)
    return false;
     rev=(rev*10)+r;
     n/=10;
     }
     if(rev==k) 
     return true;
     else
     return false;  
    }
};
