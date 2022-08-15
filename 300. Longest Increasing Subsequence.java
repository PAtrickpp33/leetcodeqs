class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxl=0;
        int[] dp=new int[nums.length];
        for(int num:nums){
            int lo=0,hi=maxl;
            while(lo<hi){
                int mid =lo+(hi-lo)/2;
                if(dp[mid]<num){
                    lo=mid+1;
                }else{
                    hi=mid;

                }
            }
            dp[lo]=num;
            if(lo==maxl){
                maxl++;
            }
        }
        return maxl;
    }
}