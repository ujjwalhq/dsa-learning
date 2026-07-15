class Solution {
    public String truncateSentence(String s, int k) {
        //without split() function
        int count =0;
        int i=0;
         while(i< s.length() && count<k){
          char ch=s.charAt(i);
          if(ch==' '){
                count++;
            }
            if (count == k) {

              return s.substring(0,i);
          }
            i++;
        }
        return s.substring(0,i);
    }
}