class Solution {
    public int addDigits(int num) {
        int n=num;
        while(n>9){
            int s=0;
            while(n!=0)
            {
                s+= n%10;
                n/=10; 
            }
            n=s;
        }
        return n;
    }
}
