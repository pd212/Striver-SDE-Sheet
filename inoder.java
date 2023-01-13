
import java.util.* ;
import java.io.*; 

    
   // Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }



public class Solution {
    static List<Integer>ans;
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        ans.add(root.data);
        inorder(root.right);
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        ans=new ArrayList<>();
        inorder(root);
        return ans;
    }
}