class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int i = 0;
        // int j = nums.length - 1;
        // while (i < j) {
        //     while (i < j && nums[i] % 2 == 0) {
        //         i++;
        //     }
        //     while (i < j && nums[j] % 2 != 0) {
        //         j--;
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = temp;
        // }
        // return nums;

        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
                if(nums[i]%2==0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
        } 
        return nums;
    }
}