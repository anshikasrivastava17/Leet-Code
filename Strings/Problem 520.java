class Solution {
    public boolean detectCapitalUse(String word) {
        char a = word.charAt(0);
        for(int i=1; i<word.length();i++)
        {
            if(Character.isLowerCase(a)) //1st is lowercase so rest cannot be uppercase
            {
                if(Character.isUpperCase(word.charAt(i)))
                return false;
            }
            else //1st is uppercase
            {
                char b = word.charAt(1);
                if(Character.isUpperCase(b)) //2nd is also uppercase means now all to be upper
                {
                    if(Character.isLowerCase(word.charAt(i)))
                    return false;
                }
                else //2nd is lowercase means all should be lower only
                {
                    if(Character.isUpperCase(word.charAt(i)))
                    return false;
                }
            }
        }
        return true;
    }
}
