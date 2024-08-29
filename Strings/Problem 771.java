/* You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A". */

 
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0; i<stones.length();i++)
        {
            char ch = stones.charAt(i);
            if(jewels.indexOf(ch)!= -1)
            c++;
        }
        return c;
    }
}
