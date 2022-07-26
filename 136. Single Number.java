class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        
        int i = 0;
        int j = 1;
        while (j <= nums.length - 1){
             if (nums[i] != nums[j]) {
                return nums[i];
            }
            
           
            i += 2;
            j += 2;
        }

        return nums[nums.length - 1];
    }
}