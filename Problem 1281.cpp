/* Given an integer number n, return the difference between the product of its digits and the sum of its digits */

class Solution {
public:
    int subtractProductAndSum(int n) {
    int p=1,s=0;
    while(n!=0){
    int d =n%10;
    p=p* d;
    s=s+ d;
    n=n/10;
    }  
    return p-s;
    }
};
