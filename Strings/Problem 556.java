class Solution {
    public int nextGreaterElement(int n) {
        char arr[] = (Integer.toString(n)).toCharArray();
        int i=arr.length-2;
        StringBuilder ans = new StringBuilder();
        while(i>=0 && arr[i] >= arr[i+1])
            i--;

        if(i == -1)
        return -1;

        int k = arr.length-1;

        while(arr[k] <= arr[i])
        k--;

        swap(arr,i,k);

        for(int j=0;j<=i;j++) //swapped at i so all elements before i are appended
        ans.append(arr[j]);

        for(int j=arr.length-1;j>i;j--) //for reversal
        ans.append(arr[j]);

        long num_ans = Long.parseLong(ans.toString());

        return (num_ans > Integer.MAX_VALUE) ? -1 : (int)num_ans;
    }

    void swap(char[] arr,int i,int j)
    {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
