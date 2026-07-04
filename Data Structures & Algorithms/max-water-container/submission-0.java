class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int left=0;
        int right=heights.length-1;

        while(left<right){
            int curr=Math.min(heights[left], heights[right]);
            maxWater=Math.max(maxWater, curr*(right-left));

            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxWater;
    }
}
