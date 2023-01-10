// public class RemoveNthNodeFromEndofList {
    
// }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Stack<Integer>s=new Stack<>();
        // while(head != null){
        //     s.push(head.val);
        //     head = head.next;
        // }
        // s.removeElementAt(s.size()-n);
        // ListNode ans = null;
        // ListNode temp = new ListNode();
        // while(!s.empty()){
        //     temp = new ListNode(s.pop());
        //     temp.next = ans;
        //     ans = temp;
        // }
        // return ans;

        //using 2pointers

       ListNode newHead = new ListNode(0);
       newHead.next = head;
       ListNode slow = newHead;
       ListNode fast = newHead;
       while(n>0){
           fast = fast.next;
           n--;
       }
       while(fast.next!=null){
           fast = fast.next;
           slow=slow.next;
       }
       slow.next = slow.next.next;
       return newHead.next;
    }
}