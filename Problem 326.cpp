/*Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x. */

class Solution {
public:
    bool isPowerOfThree(int n) {
       int c=0;
       if(n==0)
       return false;
    while(n!=0)
    {
        if(n!=1 && n%3!=0)
        {
            c++;
            break;
        }
        n=n/3;
    }    
    if(c==0)
    return true;
    else
    return false;
    }
};    
