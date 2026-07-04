class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        int k=0;

        for(int val: nums1){
            res[k++]=val;
        }
        for(int val: nums2){
            res[k++]=val;
        }
        Arrays.sort(res);
        int n=res.length;

        if(n%2==1){
            return res[n/2];
        }
        return (res[n/2-1]+res[n/2])/2.0;
    }
}
