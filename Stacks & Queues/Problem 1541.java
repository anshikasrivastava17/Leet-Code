class Solution {
    public int minInsertions(String s) {
        int open = 0;                    // Tracks unmatched '('
        int insertions = 0;             // Tracks needed insertions

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') 
                open++;     
            else {                      // ch == ')'

                // Check if there's a second ')', else we need an extra ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') 
                    i++;                        // Skip the next ')', as pair found
                else 
                    insertions++;               // Need an extra ')'
                

                // Match with an unmatched '(' if possible
                if (open > 0) 
                    open--; // Matched a pair of '()' with one `(`
                else 
                    insertions++; // No '(' to match, need an extra '('
            }
            i++;
        }

        // Any unmatched '(' needs two ')'
        insertions += 2 * open;
        return insertions;
    }
}
