class Solution {
    public int numberOfSteps(int n) {
       int c=0;
       return helper(n,c);
      
    }

    int helper (int n, int c)
    {
        if(n==0)
        return c;

        if(n%2==0)
        return helper(n/2,c+1);

        return helper(n-1,c+1);
    }
}
