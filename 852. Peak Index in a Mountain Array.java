class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
       int right=arr.length-1;
      int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            //left and right <middle,middle is result
            if(arr[mid-1]<arr[mid]&& arr[mid]>arr[mid+1]) break;
            //right>left,mountain in right
            if(arr[mid+1]>arr[mid]) left=mid;
            //right<left,mountain in left
            else if(arr[mid+1]<arr[mid]) right=mid;
        }
        return mid;
    }
}