class Solution {
    public int reachNumber(int target) {
        int sum = 0, steps = 0;
        target = Math.abs(target);
        while(sum<target)
        {
            sum = sum + steps; //0+1+2+3 i.e. for each ith move
            steps++;
        }

        while((sum - target) % 2 == 1 ){ //odd
            sum = sum + steps;
            steps++;
        }

        return steps-1;
    }
}
