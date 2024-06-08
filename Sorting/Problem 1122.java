/* Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order. */

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int[] ans=new int[n];
        int k = 0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<n;j++){
            if(arr2[i]==arr1[j]){
            ans[k++]=arr2[i]; 
            arr1[j]= -1; //mark all values that have been inserted as -1
            }
        }}

        int[] left=new int[n-k]; //remaining elements that havent been added
        int x=0;
        for(int i=0;i<n;i++){
            if(arr1[i]!=-1){
                left[x++]=arr1[i];
            }
        }
        Arrays.sort(left);
        x = 0;
        for(int i=0;i<left.length;i++){
            ans[k++]=left[x++];
        }
        return ans;
    }
}
