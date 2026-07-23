class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;

        int prod = 1;
        int left = 0;
        int count = 0;

        for(int r = 0; r < nums.length; r++) {
            prod = prod * nums[r];
            while(prod >= k) {
                prod = prod / nums[left];
                left++;
            }
            count = count + r - left + 1;
        }
        return count;
    }
}