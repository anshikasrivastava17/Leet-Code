class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int c1 = 10000;
        long c2 = (long) Math.pow(10, 9);
        boolean bulky = false, heavy = false;

    
        long volume = (long) length * (long) width * (long) height;

        if (length >= c1 || width >= c1 || height >= c1 || volume >= c2) 
            bulky = true;
        

        if (mass >= 100) 
            heavy = true;
        

        if (bulky && heavy) 
            return "Both";
        else if (bulky) 
            return "Bulky";
        else if (heavy) 
            return "Heavy";

        return "Neither";
    }
}
