class Solution {
    public String defangIPaddr(String address) {
        
        if (address == null || address.length()==0) 
            return "";

        StringBuilder sb = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') 
                sb.append("[.]");
             else 
                sb.append(ch);
        }
        return sb.toString();
    }
}
