class Solution {
    public int fib(int n) {
       int b = 0, a = 1, sum=0;
       if(n==1)
       return 1;
       else if(n==0)
       return 0;
       else{
       for(int i=2; i<=n; i++)
       {
        sum = b + a;
        b = a;
        a = sum;
       } 
       return sum;
    }}
}
