class Solution {
    public int[] twoSum(int[] nums, int target) {

        /**
        
        int[] nums =[3,4,5,6];
        target=7
        [0, 1]
        m[]
        7-3=4
        m[3, 0];

        7-4=3
        [0, 1]

        
        */
       
       HashMap<Integer, Integer> map= new HashMap<>();

       for(int i=0; i<nums.length; i++){

        int complement=target-nums[i];

        if(map.containsKey(complement)){

            return new int[]{map.get(complement), i};

            }else{

                map.put(nums[i], i);

            }

       }
       return new int[]{};
      
      

      
       


        
    }
}
