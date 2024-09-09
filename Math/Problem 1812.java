class Solution {
    public boolean squareIsWhite(String coordinates) {
       //even even black, odd odd black

       char a = coordinates.charAt(0);
       int n = a - 'a' + 1;
       int n2 = coordinates.charAt(1);

       if((n%2==0 && n2%2==0) || (n%2!=0 && n2%2!=0)) //both even or both odd
       return false;

       return true;
    }
}
