class Solution {
    public int finalValueAfterOperations(String[] operations) {
          int i=0;
        int x=0;
        while (i<operations.length) {
            if (operations[i].charAt(1)=='+') {
              x++;
            }
            else{
                x--;
            }
            i++;
        }
        return x;
    }
}