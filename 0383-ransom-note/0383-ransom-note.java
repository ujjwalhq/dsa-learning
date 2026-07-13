class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];

      int j=0;
      while (j<magazine.length()) {
          int index = magazine.charAt(j)-'a';
          freq[index]+=1;
          j++;
      }

      int i=0;
      while (i<ransomNote.length()) {
          int index = ransomNote.charAt(i)-'a';
          if (freq[index]>0) {
            freq[index]--;
             i++;
          }
          else
            return false;
      }


        return true;
    }
}