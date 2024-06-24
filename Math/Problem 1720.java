class Solution {
    public int[] decode(int[] encoded, int first) {
        
        //encoded[i] = arr[i] XOR arr[i + 1]  here missing is arr[i+1] rest we know
        //XOR of arr[i] both sides
        //encoded[i] XOR arr[i] = arr[i] XOR arr[i + 1] XOR arr[i]
        //a ^ a = 0

        int arr[]= new int[encoded.length + 1];
        arr[0]=first;

        for(int i=0; i<encoded.length; i++)
        {
           arr[i+1] = encoded[i] ^ arr[i];  
        }
        return arr;
    }
}
