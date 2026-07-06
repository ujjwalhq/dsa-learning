class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb =new StringBuilder();
        int i=0;
        while(i<address.length()){
            if (address.charAt(i)=='.') {
              sb.append("[.]");
            }
            else{
              sb.append(address.charAt(i));
            }
            i++;
        }
        String add=sb.toString();
        return sb.toString();
    }
}