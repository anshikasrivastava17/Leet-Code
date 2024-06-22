class Solution {
    public int maxArea(int[] A) {
        int start = 0;
        int end = A.length -1;
        int area = 0;
     
        while (start < end)
        {
            area = Math.max(area, Math.min(A[start], A[end]) * (end - start));
            //Math.min for height and (r-l) for base length 
                         
            if (A[start] < A[end])
                start++;   
            else
                end--;
        }
        return area;
    }
}
