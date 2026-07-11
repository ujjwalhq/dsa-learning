class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] letters = new boolean[26];

        // Mark each letter as present
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            letters[ch - 'a'] = true;
        }

        // Check if any letter is missing
        for (int i = 0; i < 26; i++) {
            if (letters[i] == false) {
                return false;
            }
        }

        return true;
    }
}