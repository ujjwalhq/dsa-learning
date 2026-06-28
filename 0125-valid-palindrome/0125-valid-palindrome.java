class Solution {

    public boolean isPalindrome(String s) {
       String str = s.toLowerCase();
        int len = str.length();
        int i=0;
        int j=len-1;
        
        while(i<j){
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(j);
            if((leftChar >= 'a' && leftChar <= 'z') || (leftChar >= '0' && leftChar <= '9')){
                    if((rightChar >= 'a' && rightChar <= 'z') || (rightChar >= '0' && rightChar <= '9')){
                        if(leftChar==rightChar){
                            i++;
                            j--;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        j--;
                    }
            }
            else{
                i++;
            }
        }
        
        return true;
    }
}