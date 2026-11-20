class Solution {
    public boolean isAnagram(String s, String t) {
      
      //length


      //amount of characters in each string

      //ascii

      //97

      if(s.length() != t.length()) return false;

      int[] character_count= new int[26];

      for(int i=0; i<s.length(); i++){

        character_count[s.charAt(i)-'a']++;
        character_count[t.charAt(i)-'a']--;


      }

      for(int count: character_count){


        if(count!=0){
            return false;
        }
      }

      return true;


    }
}
