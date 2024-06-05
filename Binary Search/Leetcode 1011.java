class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            max = Math.max(max,weights[i]);
        }
        if(weights.length==days){
            return max;
        }
        int start=max, end = sum, ans=0;
        while(start<=end){
            int mid = start + (end - start)/2;
             if(isPossible(weights,mid,days)==true){
                ans = mid; //mid is value here not weight
                end = mid - 1;
             }
             else
             start = mid + 1;
        }

        return ans; }
    public static boolean isPossible(int weight[],int mid,int days){ //mid here contains wt
        int d=1; 
        int sum=0;
        for(int i=0;i<weight.length;i++){
            sum+=weight[i];
            if(sum>mid){
                d++;
                sum=weight[i];
            }
        }
        return d<=days;
    } 
    }
