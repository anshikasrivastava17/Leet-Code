class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[]= new int[n+1];
        arr[0]=0;
        int ans=0;

       for(int i=0; i<gain.length;i++)
       {
        arr[i+1]= arr[i] + gain[i];
        if(arr[i+1]>ans)
        ans = arr[i+1];
       } 

       return ans;
    }
}
