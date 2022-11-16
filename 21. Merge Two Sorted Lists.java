class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode node = res;
        while(list1!=null&&list2!=null){
            int val=0;
            if(list1.val<=list2.val){
                val=list1.val;
                list1=list1.next;
            }else{
                val=list2.val;
                list2=list2.next;
            }
            node.next=new ListNode(val);
            node=node.next;

        }
        if(list1!=null){
            node.next=list1;
        }
        if(list2!=null){
            node.next=list2;
        }
        return res.next;

    }
}