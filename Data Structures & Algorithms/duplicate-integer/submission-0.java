class Solution {
    public boolean hasDuplicate(int[] nums) {
        //int[] nums=[1, 2, 3, 4]=>false
        //int[] nums=[1, 2,2,  3, 4]=>true

        int n=nums.length;

        Arrays.sort(nums);

        for(int i=0; i<n-1; i++){

            if(nums[i]==nums[i+1]){
                return true;
            }
        }

        return false;

        
    }
}