import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
		   if(head==null || head.next==null)return null;
        Node slow = head;
        Node fast = head;
        Node curr = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(slow != curr){
                    curr = curr.next;
                    slow = slow.next;
                }
                return curr;
            }
        }
        return null;
    }
}