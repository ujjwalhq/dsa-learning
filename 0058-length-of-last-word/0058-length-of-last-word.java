class Solution {
    public int lengthOfLastWord(String str) {
        String s= str.trim();
        int sLen=s.length()-1;
        int count=0;
        while(sLen >= 0 && s.charAt(sLen)!=' '){
                count++;
                sLen--;
        }
        return count;
    }
}