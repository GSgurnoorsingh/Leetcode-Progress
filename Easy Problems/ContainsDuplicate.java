import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}    

//I will update the solution of this problem when i have learned about hashsets . As i currently don't know them
//and we are expected to solve this problem using hashsets
