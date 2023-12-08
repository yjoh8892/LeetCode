class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Count = 0;
        int MaxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                Count += 1;
            }
            else {
                MaxCount = Math.max(MaxCount, Count);
                Count = 0;
                }
        }
        return Math.max(MaxCount, Count);
    }
}