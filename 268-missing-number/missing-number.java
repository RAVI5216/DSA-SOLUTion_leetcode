class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int Total_sum=(len*(len+1))/2;
        int actual_sum=0;
        for(int num:nums)
        {
            actual_sum+=num;
        }
        return Total_sum - actual_sum;
    }
}