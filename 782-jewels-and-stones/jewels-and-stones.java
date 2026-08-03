class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // brute force approach
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char target=jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
              if (target==stones.charAt(j)) {
                  count++;
              }
            }
        }

        return count;
    }
}