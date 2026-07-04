class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<numbers.length;i++){

            int req=target-numbers[i];
            if(hm.containsKey(req)){
                return new int[]{hm.get(req),i+1};
            }
            hm.put(numbers[i], (i+1));
        }
        return new int[]{-1,-1};
    }
}
