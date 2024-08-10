/* A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero. */
  

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            boolean b = divideNum(i);
            if(b)
            result.add(i);
        }
        return result;
    }

    boolean divideNum(int n)
    {
        int k = n;
        while(n!=0)
        {
            int d = n%10;
            if(d==0) return false;
            if(k%d!=0)
            return false;
            n/=10;
        }
        return true;
    }
}
