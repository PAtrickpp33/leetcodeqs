/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left=0,right =n;
            while(left<=right){
                int mid=left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
            }
/*教大家二分法一个套路
1.while 永远是 while(left <= right)
2.将middle会落的地方分成两份
2.内部 永远是 left = middle + 1 和 right = middle - 1
如果答案落在left = middle + 1 的里面， 最终return right
如果答案落在right=middle + 1 里面， 最终return left

屡试不爽，没有失败过 */