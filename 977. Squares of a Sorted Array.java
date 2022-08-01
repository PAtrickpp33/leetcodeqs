class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int cnt = nums.length - 1, left = 0, right = nums.length - 1;
        while (left <= right) {
            if ((nums[left] | nums[right]) < 0 && -nums[left] > nums[right]) 
                ans[cnt--] = nums[left] * nums[left++];
            else ans[cnt--] = nums[right] * nums[right--];
        }
        return ans;
    }
}