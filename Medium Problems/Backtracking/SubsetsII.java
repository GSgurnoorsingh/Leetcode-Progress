import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);              
        this.nums = nums;

        backtrack(0, new ArrayList<>());

        return result;
    }

    public void backtrack(int start, List<Integer> subset) {
        result.add(new ArrayList<>(subset));

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            subset.add(nums[i]);

            // Explore
            backtrack(i + 1, subset);

            // Undo
            subset.remove(subset.size() - 1);
        }
    }
}
