class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        StringBuilder ans = new StringBuilder("");
        for(int i=0; i<arr.length; i++){

        StringBuilder x = new StringBuilder(arr[i]);
        ans.append(x.reverse());
        if(i!=arr.length-1)  //space after every word
        ans.append(" ");
    }
     return ans.toString();
}}
