
class Solution {
    public ListNode reverseList(ListNode head) {
        
         ListNode prev = null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;



        // using recursion
        // if(head == null || head.next==null)return head;

        // ListNode rev = reverseList(head.next);

        // head.next.next=head;

        // head.next=null;
        // return rev;



       
    }
}
