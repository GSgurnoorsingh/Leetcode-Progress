class Solution {
    List<List<Integer>>result=new ArrayList<>();
    int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        this.nums=nums;

        boolean[] used=new boolean[nums.length];
        List<Integer>permuteList=new ArrayList<>();

        backtrack(permuteList,used);
        return result;
    }
    public void backtrack(List<Integer> permuteList,boolean[] used){
        //base case
        if(permuteList.size()==nums.length){
            result.add(new ArrayList<>(permuteList));
            return;
        }
        //try every element
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            //choose
            permuteList.add(nums[i]);
            used[i]=true;

            //explore
            backtrack(permuteList,used);

            //undo(backtrack)
            permuteList.remove(permuteList.size()-1);
            used[i]=false;
        }
    }
}
