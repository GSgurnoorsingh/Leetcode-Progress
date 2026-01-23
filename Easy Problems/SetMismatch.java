class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
                ans.add(j+1);
                break;
            }
        }
        int[] arr=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            arr[k]=ans.get(k);
        }
        return arr;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
