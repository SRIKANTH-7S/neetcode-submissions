class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        // Stores all subsets
        List<List<Integer>> ans = new ArrayList<>();

        // Start with the empty subset
        ans.add(new ArrayList<>());

        // Process each number one by one
        for (int num : nums) {

            // Number of subsets currently present
            int size = ans.size();

            // Traverse only the existing subsets
            for (int i = 0; i < size; i++) {

                // Make a copy of the current subset
                List<Integer> temp = new ArrayList<>(ans.get(i));

                // Add the current number to the copied subset
                temp.add(num);

                // Store the new subset
                ans.add(temp);
            }
        }

        return ans;
    }
}