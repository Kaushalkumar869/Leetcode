class Solution {
    int c=0;
    void find(int []nums,int target,int idx,int sum){
        if(idx==nums.length){
            if(sum==target){
                c++;
            } 
            return;
        }
        find(nums, target, idx + 1, sum + nums[idx]);
        find(nums, target, idx + 1, sum - nums[idx]);
    }
    public int findTargetSumWays(int[] nums, int target) {
       c = 0;
       find(nums,target,0,0);
       return c;
    }
}