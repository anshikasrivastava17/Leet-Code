class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); 
        String vo = "aeiouAEIOU"; 
        int start = 0, end = s.length() - 1;

        while (start < end) {
            char c1 = arr[start];
            char c2 = arr[end];

          
            if (vo.indexOf(c1) == -1) {
                start++;
                continue;
            }

            if (vo.indexOf(c2) == -1) {
                end--;
                continue;
            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr); 
    }
}
