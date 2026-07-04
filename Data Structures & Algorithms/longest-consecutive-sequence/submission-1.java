class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int maxLen=0;
        for(int num : hs){
            if(!hs.contains(num-1)){
                int curr=num;
                int len=1;

                while(hs.contains(curr+1)){
                    curr++;
                    len++;
                }
                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}
