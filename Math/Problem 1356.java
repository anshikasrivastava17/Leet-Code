class Solution {
    public int[] sortByBits(int[] arr) {

        for(int i=0; i<arr.length; i++)  
        {
            boolean swapped = false;

            for(int j=1; j<arr.length-i; j++) {  //bubble sort
                if(count(arr[j]) < count(arr[j-1])){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

                if(count(arr[j]) == count(arr[j-1])){
                      //count of 1 bits is same so sort asc.
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped = true;
                    }
                }
            }
            
            if(swapped == false){
                break;
            }
        }
        return arr;
    }
    public int count(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
