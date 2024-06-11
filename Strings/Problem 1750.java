class Solution {
    public int minimumLength(String s) {
        int i = 0, j = s.length() - 1;
      
        while(i < j && s.charAt(i) == s.charAt(j)) {
            
            char ch = s.charAt(i);

            while(i < j && s.charAt(i) == ch) {  //expanding prefix
                i++;
            }

            while(i <= j && s.charAt(j) == ch) {  //expanding suffix
                j--;
            }
        }
        return j - i + 1;
    }
}
