class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int sum = 0, max = 0;// mark rain water height
        while (left < right) {
            while (left < right && height[left] <= max) { // if number < rain water height
                sum += (max - height[left]);
                left++;
            }
            while (left < right && height[right] <= max) {
                sum += (max - height[right]);
                right--;
            }
            max = Math.min(height[left], height[right]);
        }
        return sum;
    }
}