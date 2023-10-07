/* Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight). */

class Solution {
public:
    int hammingWeight(uint32_t n) {
     int c=0;
    while(n!=0)
    {
        if(n&1)
        c++;
        n=n>>1;
    }   
    return c;  }
};
