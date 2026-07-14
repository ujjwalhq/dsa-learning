class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];

       int i=0;
       while (i<s.length()) {
            int index = s.charAt(i)-'a';
            freq[index]+=1;
            i++;
       }
       int j=0;
       while (j<s.length()) {
            int index = s.charAt(j)-'a';
            if (freq[index]==1) {
                return j;
            }
            j++;
       }
        return -1;
    }
}