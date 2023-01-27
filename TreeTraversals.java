import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
	public static void InPrePost(BinaryTreeNode<Integer> root,List<Integer>inoder,
	List<Integer>preoder,List<Integer>postorder){
		if(root == null)return;

		preoder.add(root.data);
		InPrePost(root.left, inoder, preoder, postorder);
		inoder.add(root.data);
		InPrePost(root.right, inoder, preoder, postorder);
		postorder.add(root.data);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>>ans=new ArrayList<>();
		if(root == null)return ans;
		List<Integer>inoder=new ArrayList<>();
		List<Integer>preoder=new ArrayList<>();
		List<Integer>postoder=new ArrayList<>();
		InPrePost(root,inoder,preoder,postoder);
		ans.add(inoder);
		ans.add(preoder);
		ans.add(postoder);
		return ans;
    }
}
