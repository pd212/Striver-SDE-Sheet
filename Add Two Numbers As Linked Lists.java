import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
          int sum =0;
        LinkedListNode ans,dummy = new LinkedListNode(0);
        ans = dummy;
       while (head1 != null ||head2 != null || sum != 0) {
        if (head1 != null) {
            sum += head1.data;
            head1 = head1.next;
        }
        if (head2 != null) {
            sum +=head2.data;
           head2 =head2.next;
        }
        ans.next = new LinkedListNode(sum%10);
        sum /= 10;
        ans = ans.next;
    }
        return dummy.next;
    }
}