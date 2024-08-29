class Solution {
    public char findTheDifference(String s, String t) {
         int[] arr = new int[26];
        for(int i=0;i<s.length();++i)
        {
            arr[s.charAt(i) - 'a'] ++;
            arr[t.charAt(i) - 'a'] --;
        }
        arr[t.charAt(t.length()-1) - 'a'] --; //for last char in t bcoz t length = s + 1


        for(int i=0;i<26;++i)
        {
            if(arr[i]==-1)
            return (char) (i+'a');
        }
        
        return t.charAt(0); //if(s.length()==0)
    }
}
