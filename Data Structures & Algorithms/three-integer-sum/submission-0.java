class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
        Input: nums = [-1,0,1,2,-1,-4]

        answer=[[-1, 0, 1]]
        [-4, -1, -1, 0, 1, 2]
        */

        List<List<Integer>> result=new ArrayList<>();
        int N=nums.length;
        Arrays.sort(nums);

    

        for(int i=0; i<N-2; i++){

            //get rid of duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;

            if(nums[i]>0)break;

            int left=i+1;
            int right=N-1;
            int target=-nums[i];

            while(left<right){

                int sum=nums[left]+nums[right];

                if(sum==target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));


                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }

                while(left<right&&nums[right]==nums[right-1])   
                {
                    right--;
                }
                    left++;
                    right--;

                }else if(sum<target){
                    left++;

                }else{
                    right--;

                }

            }

        }
        return result;




    

    }
}