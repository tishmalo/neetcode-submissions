class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       

        /**
        Input: strs = ["act","pots","tops","cat","stop","hat"]
        result=[["act", "cat"], ["pots", "tops", "stop"], ["hat"]]
        //act
        //opst
        //aht
        */

        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();

        for(String str: strs){

            char[] strChar= str.toCharArray();

            Arrays.sort(strChar);

            String sortedString=String.valueOf(strChar);

            if(!groupedAnagrams.containsKey(sortedString)){
                groupedAnagrams.put(sortedString, new ArrayList<>());
            }

            groupedAnagrams.get(sortedString).add(str);


        }

        return new ArrayList<>(groupedAnagrams.values());
        
    }
}
