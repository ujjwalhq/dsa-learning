class Solution {
    public boolean detectCapitalUse(String word) {
         int capcount = 0;

        int i = 0;
        while (i < word.length()) {
            if (Character.isUpperCase(word.charAt(i))) {
                capcount++;
            }
            i++;
        }

        if (capcount == word.length()) {
            return true;
        } else if (capcount == 0) {
            return true;
        } else if (capcount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }
}