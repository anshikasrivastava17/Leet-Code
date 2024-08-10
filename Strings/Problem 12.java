class Solution {
    public String intToRoman(int num) {
        int value[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0; i<value.length; i++){

            while(num >= value[i]){
                num = num - value[i];
                roman.append(symbols[i]);
            }
        }
        
        return roman.toString();
    }
}
