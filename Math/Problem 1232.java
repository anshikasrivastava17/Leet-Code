class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        // int x0 = coordinates[0][0];
        // int y0 = coordinates[0][1];
        // int x1 = coordinates[1][0];
        // int y1 = coordinates[1][1];
        
        //x1 - x0 and y1 - y0
        int initialDx = coordinates[1][0] - coordinates[0][0];
        int initialDy = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length - 1; i++) {
            int x2 = coordinates[i + 1][0];
            int y2 = coordinates[i + 1][1];

            int currentDx = x2 - coordinates[i][0];
            int currentDy = y2 - coordinates[i][1];
            
            if (initialDy * currentDx != initialDx * currentDy) 
                return false;
        }
        
        return true;
    }
}
