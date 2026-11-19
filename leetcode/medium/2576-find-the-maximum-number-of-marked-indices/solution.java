class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
         int ans =0;
        Arrays.sort(nums);
        int i=0;
        for(int j=(nums.length+1)/2;j<nums.length;j++){
            if(2*nums[i]<=nums[j]){
            ans++;
                i++;
            }
        }
        return 2*ans;
    }
}