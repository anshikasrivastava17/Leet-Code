class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
         int currentCost = 0;
         int left = 0; 
         int ans = 0;  

         for(int i = 0; i < s.length(); i++) { //i is right here
            
            currentCost = currentCost + Math.abs(s.charAt(i) - t.charAt(i));

            while(currentCost > maxCost)
            {
               currentCost = currentCost - Math.abs(s.charAt(left) - t.charAt(left)); 
               left++;
            }

            ans = Math.max(ans, i-left+1);
         }

        return ans;
    }
}
