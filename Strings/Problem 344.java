/* Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory. */

class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
       while(start < end)
       {
        swap(s,start,end);
        start++; end--;
       } 
    }

    void swap(char[] s, int start, int end)
    {
        char temp = s[start];
        s[start]=s[end];
        s[end]=temp;
    }
}
