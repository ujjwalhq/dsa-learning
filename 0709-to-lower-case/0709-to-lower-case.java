class Solution {
    public String toLowerCase(String s) {
         char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
          if (arr[i] > 64 && arr[i] < 91) {
              char ch = arr[i];
              arr[i]= (char)(arr[i]+32);
          }
        }

        return new String(arr);
    }
}