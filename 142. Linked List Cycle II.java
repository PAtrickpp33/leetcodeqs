public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }
}

/**1.设置快慢指针，快指针速度为慢指针的2倍

2.找出相遇点

3.在head处和相遇点同时释放相同速度且速度为1的指针，两指针必会在环入口处相遇
 */
