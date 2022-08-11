class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total = Arrays.stream(nums).sum();
        if (total < target) {
            return 0;
        }
        int low = 1, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (exists(target, nums, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean exists(int target, int[] nums, int subarrayLen) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < subarrayLen; i++) {
            sum += nums[i];
            if (sum >= target) {
                return true;
            }
        }
        for (int i = subarrayLen; i < n; i++) {
            sum -= nums[i - subarrayLen];
            sum += nums[i];
            if (sum >= target) {
                return true;
            }
        }
        return false;
    }
}