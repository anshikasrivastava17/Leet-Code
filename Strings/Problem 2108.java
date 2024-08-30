class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++)
        {
            if(isPalin(words[i]))
            return words[i];
        }
        return "";
    }

    boolean isPalin(String word){
        int start = 0, end = word.length()-1;
        while(start<=end)
        {
            if(word.charAt(start)!= word.charAt(end))
            return false;
            else{
                start++; end--;
            }
        }
        return true;
    }
}
