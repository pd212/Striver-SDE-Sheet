import java.util.* ;
import java.io.*; 
/*
    Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}
*/

public class Solution {
	
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
		if(root == null)return false;

		if(root.data == x){
			return true;
		}
		else if(root.data < x){
			return searchInBST(root.right,x);	
		}
		else{
			return searchInBST(root.left, x);
		}




		//another method
		// if(root == null)return false;
		// Queue<BinaryTreeNode>q=new LinkedList<>();
		// q.add(root);
		// while(!q.isEmpty()){
		// 	int n = q.size();
		// 	for(int i=0;i<n;i++){
		// 		BinaryTreeNode<Integer>temp = q.poll();
		// 		if(temp.data == x){
		// 			return true;
		// 		}
		// 		if(temp.left != null){
		// 			q.add(temp.left);
		// 		}
		// 		if(temp.right != null){
		// 			q.add(temp.right);
		// 		}
		// 	}
		// }
		// return false;
	}
}