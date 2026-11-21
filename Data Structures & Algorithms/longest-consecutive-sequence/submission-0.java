class Solution {
    public int longestConsecutive(int[] nums) {
        /**
        nums = [1, 20,4,10,3,4,5]
        longest=4
      3, 4, 6
        
        */

        int N=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int longest=0;

        if(N==0)return 0;

        for(int n:nums)set.add(n);

        for(int n:set){

            if(!set.contains(n-1)){

                int len=1;

                while(set.contains(n+len))len++;

                longest=Math.max(longest, len);

            }
        }

        return longest;

      

        
    }
}
