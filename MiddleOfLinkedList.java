import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 


    //Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };



public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        Node tort=head;
        Node here = head;
        if(head == null){
            return head;
        }
        while(tort != null && tort.next!=null){
             here = here.next;
            tort = tort.next.next;
           
        }
        return here;
    }
}
