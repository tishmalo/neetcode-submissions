class Solution {
    public int[] productExceptSelf(int[] nums) {
   /**
   nums = [1,2,4,6]
   result=[48, 24, 12, 8]
   pre=2;
   post=6;
   1[1,2,4,6]1
   ans1=[1, 1, 2, 8]
   ans2=[48, 24, 12, 8]
   */

    int[] result=new int[nums.length];
    Arrays.fill(result, 1);
    int pre=1, post=1;

    for(int i=0; i<nums.length; i++){

        result[i]=pre;
        pre=nums[i]*pre;
    }

    for(int i=nums.length-1; i>=0; i--){

        result[i]=result[i]*post;
        post=nums[i]*post;
    }

    return result;




        
     






    }
}  
