class Solution {
    public int[] plusOne(int[] digits) {
         int[] newAns = new int[digits.length + 1];
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;

            } 
            else if (i == 0) {
                newAns[0] = 1;
                return newAns;
            }
            else if (digits[i] == 9) {
                digits[i] = 0;
            }

            
        }

        return digits;
    }
}