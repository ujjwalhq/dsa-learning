class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(int i=0;i<sentences.length;i++){
          int currMax=0;
            for(int j=0;j<sentences[i].length();j++){
                if (sentences[i].charAt(j)==' ') {
                  currMax++;
                }
            }
            if (currMax>max) {
                  max= currMax;
            }
        }


        return max+1;
    }
}