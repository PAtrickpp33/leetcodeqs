class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length-1;
        if(target>=letters[n]){
            return letters[0];
        }
        int l=0,r=n;
         while(l<=r){
                int mid=l + (r - l) / 2;
                if (letters[mid]>target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return letters[l];
        }
    }