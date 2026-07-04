class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=0;
        int end=0;
        int ans=0;

        for(int pile: piles){
            end=Math.max(end,pile);
        }
        while(start<=end){
            int mid=start+(end-start)/2;

            if(isPossible(piles,h,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] piles,int h,int mid){
        int hours=0;
        for(int pile: piles){
            hours+=Math.ceil((double)(pile)/mid);
        }
        return hours<=h;
    }
}
