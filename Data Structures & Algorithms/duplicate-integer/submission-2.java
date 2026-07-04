// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Arrays.sort(nums);

//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        
        for(int val: nums){
            if(hs.contains(val)){
                return true;
            }
            hs.add(val);
        }
        return false;
    }
}