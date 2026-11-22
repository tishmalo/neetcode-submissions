class Solution {
    public boolean isPalindrome(String s) {

        /**
        s = "Was it a car or a cat I saw?"
        wasitacaroracatisew
        */

        char[] chars=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();

        int left=0, right =chars.length-1;

        while(left<right){
            if(chars[left]!=chars[right]) return false;
            left++;
            right--;
        }

        return true;
       

        
    }
}
