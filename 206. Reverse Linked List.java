class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur =head;//1
        while(cur!=null){
            ListNode next=cur.next;//2345
            cur.next=prev;//null
            prev=cur;//1
            cur=next;//2



        }
        return prev;

    }
}

