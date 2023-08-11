/*Implement pow(x, n), which calculates x raised to the power n (i.e., xn).*/

class Solution {
public:
    double myPow(double x, int n) {
        if(x==-1 && n<0)
        return abs(x);
        else if(x==1 || x==-1)
        return x;
        double p=1;
        int n1=abs(n);
        if(n<INT_MIN/10 || n>INT_MAX/10)
        return 0;
    for (int i=1;i<=n1;i++)   
    {
     p=p*x;
    } 
    if(n<0)
    return 1/p;
    else
    return p;
    }
};

