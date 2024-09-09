class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
       boolean one,two;
       //even even black, odd odd black

       char a = coordinate1.charAt(0);
       int n = a - 'a' + 1;
       int n2 = coordinate1.charAt(1);

       if((n%2==0 && n2%2==0) || (n%2!=0 && n2%2!=0)) //both even or both odd
       one = false;
       else one = true;


       char b = coordinate2.charAt(0);
       int m = b - 'a' + 1;
       int m2 = coordinate2.charAt(1);

       if((m%2==0 && m2%2==0) || (m%2!=0 && m2%2!=0)) //both even or both odd
       two = false;
       else two = true;

       if((one==true && two==true) || (one==false&& two==false))
       return true;

       return false;
    }
}
