import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/


public class Solution 
{
	public static void smallestnode(TreeNode<Integer> root,ArrayList<Integer>arr){
		if(root  == null){
			return;
		}
		smallestnode(root.left, arr);
		arr.add(root.data);
		smallestnode(root.right, arr);
	}

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		ArrayList<Integer>arr = new ArrayList<>();
		smallestnode(root,arr);
		
		//System.out.println(arr);
		return arr.get(k-1);
	}

}
