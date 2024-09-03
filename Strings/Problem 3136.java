class Solution {
    public boolean isValid(String word) {
       if(word.length()<3)
       return false;

       String vo="aeiouAEIOU"; int vow=0;
       String cons= "bcdfghjklmnpqrstvwxyz"; int con=0;
        
       for(int i=0; i<word.length();i++)
       {
        char ch = word.charAt(i);

        if(vo.indexOf(ch)!= -1) //contains vowel
        vow=1;

        if(cons.indexOf(Character.toLowerCase(ch))!= -1) //contains consonant
        con=1;

        if(Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch))
        continue;
        else
        return false;
       }

      return (vow==1 && con==1); 
    }
}
