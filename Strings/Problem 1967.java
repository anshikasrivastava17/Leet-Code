class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(int i=0; i<patterns.length;i++)
        {
            String w = patterns[i];
            if(word.indexOf(w) != -1)
            c++;
        }

        return c;
    }
}
