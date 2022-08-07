class Solution {
    public int specialArray(int[] nums) {
        int left=1;
        int right=100;
        while (left<=right){
            int mid=(left+right)/2;
            int count=getCount(nums,mid);
            if(count==mid)return mid;
            if(count<mid){
                right=mid-1;
            }else {
                left=mid+1;
            }
            
        }
        return -1;
    }
    
    private static int getCount(int[] nums, int mid) {
        int t=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=mid)t++;
        }
        return t;
    }

    
}