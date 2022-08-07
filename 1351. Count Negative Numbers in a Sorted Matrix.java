class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        
        for(int[] item : grid){
            int l=0,r=item.length-1;
            int pos = -1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(item[mid]<0){
                    r=mid-1;
                    pos=mid;
                }
                else{l=mid+1;}
                
            }
            if (pos != -1) {
                ans += item.length - pos;
            }
        }
        return ans;
            

    }
}