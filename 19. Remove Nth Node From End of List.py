# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if not head or  n <1:
            return None
        fast = head
        slow = head
        for _  in range(n): # 先让快指针走n步
            if not fast:
                return None
            fast = fast.next
        if not fast: #当要删除的节点比链表还长的时候
            return head.next
        while  fast.next:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next #将要删除的节点的前一个节点的指针指向要删除的元素的下一个元素
        return head