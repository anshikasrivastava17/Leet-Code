class Solution {
    public int[] findRightInterval(int[][] interval) {
        int n=interval.length;
        int [][] arr=new int[n][3];

        for(int i=0;i<n;i++){
            arr[i][0]=interval[i][0];
            arr[i][1]=interval[i][1];
            arr[i][2]=i;
        }


        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        int ans[]=new int[n];
         for(int i=0;i<n;i++){
            ans[arr[i][2]]=binaryseach(arr,i,n-1,arr[i][1]);
         }

        return ans;
    }

    public int binaryseach(int [][] arr,int start,int end,int target){

         int result = -1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid][0] >= target) {
                result = arr[mid][2];  
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;


    }
}
