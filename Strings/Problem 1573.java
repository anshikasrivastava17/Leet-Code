//https://leetcode.com/problems/number-of-ways-to-split-a-string/solutions/5193827/java-clean-solution-with-detail-explanation/
class Solution {
    int MOD = 1_000_000_007;
    public int numWays(String s) {
      int one = 0; //number of 1's
       for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1')
            one++;
       }
       
       if (one % 3 != 0) 
        return 0;
        

       if(one == 0){
        long n = s.length();
            return (int) ((((n - 1) * (n - 2)) / 2) % MOD);
       }

       long ones = one / 3; //dividing ones so that they can be present equally
        one = 0;
        char[] ch = s.toCharArray();
        long part1 = 0, part2 = 0;

        for (char c : ch) {
            if (c == '1') 
                one++;

            if (one == ones) 
                part1++;
            
            if (one == 2 * ones)
                part2++;
        }

        return (int) ((part1 * part2) % MOD);   
  
    }
}
