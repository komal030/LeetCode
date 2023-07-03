class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int curr = 0;
        int l = 0, r;
        int window = Integer.MAX_VALUE;
        for (r = 0; r < n; r++) {
            curr += nums[r];
            while (curr >= target) {
                window = Math.min(window, r + 1 - l);
                curr -= nums[l];
                l++;
            }
        }
        if (window < Integer.MAX_VALUE)
            return window;
        else return 0;
    }
}
