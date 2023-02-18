import java.util.* ;

//import com.sun.source.tree.BinaryTree;

import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {

	static boolean flag;
	public static boolean checkpairSum(BinaryTreeNode root , int k,HashMap<Integer,Integer>hm){
		if(root == null){
			return false;
		}
		hm.put(root.data,1);
		if(hm.containsKey(k - root.data)){
			//flag = true;
			return true;
		}
		// checkpairSum(root.left, k,hm);
		// checkpairSum(root.right, k,hm);

		return checkpairSum(root.left, k, hm) || checkpairSum(root.right, k, hm);
	}
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		flag=false;
		HashMap<Integer,Integer>hm=new HashMap<>();
		return checkpairSum(root, k, hm);
		///System.out.println(hm);
		
		//return flag;
	}
}

