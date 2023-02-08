import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
	public static void addelements(TreeNode<Integer> root,ArrayList<Integer>arr){
		if(root == null){
			//arr.add(-1);
			return;
		}
		
		addelements(root.left, arr);
		arr.add(root.data);
		addelements(root.right, arr);
	}
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
		ArrayList<Integer>arr=new ArrayList<>();
		addelements(root,arr);
		
		//Collections.sort(arr);
		//System.out.println(arr);
		if(k > arr.size()){
			return -1;
		}
		return  arr.get(arr.size()-k);
	}
}