class Solution {
    public int lengthOfLastWord(String str) {
        StringBuilder sb=new StringBuilder();
        String s= str.trim();
        int sLen=s.length()-1;
        while(sLen >= 0 && s.charAt(sLen)!=' '){
                sb.append(s.charAt(sLen));
                sLen--;
        }
        return sb.length();
    }
}