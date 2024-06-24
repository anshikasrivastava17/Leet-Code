class Solution {
    public int numberOfSteps(int n) {
        int c=0;

        if(n==0)
        return 0;
        
        while(n!=0)
        {
            if((n&1)==1) //odd 
            {
            n--; c++;
            }

            n/=2;
            c++;

        }
        return c-1;
    }
}
