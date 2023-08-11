/*Given an integer n, return true if it is a power of four. Otherwise, return false.
  An integer n is a power of four, if there exists an integer x such that n == 4x. */

class Solution {
public:
    bool isPowerOfFour(int n) {
       int c=0;
       if(n==0)
       return false;
    while(n!=0)
    {
        if(n!=1 && n%4!=0)
        {
            c++;
            break;
        }
        n=n/4;
    }    
    if(c==0)
    return true;
    else
    return false;
    }
}; 
