import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
	public static Node merge(Node first, Node second) {
		// If the first is null return second
		if (first == null) {
			return second;
		}

		// If the second is null return first
		if (second == null) {
			return first;
		}

		Node merged;

		if (first.data < second.data) {
			merged = first;
			merged.child = merge(first.child, second);
		} else {
			merged = second;
			merged.child = merge(first, second.child);
		}
		return merged;
	}

	public static Node flattenLinkedList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		// Recur on next node
		head.next = flattenLinkedList(head.next);

		// Merge with the current
		head = merge(head, head.next);

		return head;
	}
}

