class Solution {
    public int findComplement(int num) {

        // a ^ 1 gives complement for one bit, do some for all bits

        int n = 0;
       while(n < num){
            n = (n << 1 | 1);// to create a number n with as many 1 bits as there are total bits in num
        }
        return n ^ num;
    }
}
