class Solution {
    public int maxArea(int[] heights) {

        /**
        height = [1,7,2,5,4,7,3,6]

        height=Math.min(height[i], height[j])=6
        width=7-1=6
        area =6*6=36
        
        */

        int left=0, right=heights.length-1;

        int maxWater=0;

        while(left<right){

            int height=Math.min(heights[left], heights[right]);
            int width=right-left;
            int currentArea=height*width;
            maxWater=Math.max(maxWater, currentArea);

            if(heights[left]<heights[right]){

                left++;
            }else{
                right--;
            }
            

        }
        return maxWater;

      

     

    }
}
