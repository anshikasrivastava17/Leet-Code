/*Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x. */

class Solution {
public:
    bool isPowerOfTwo(int n) {
       int c=0;
       if(n==0)
       return false;
    while(n!=0)
    {
        if(n!=1 && n%2!=0)
        {
            c++;
            break;
        }
        n=n/2;
    }    
    if(c==0)
    return true;
    else
    return false;
    }
};

 
