// public class postorder {
    
// }
import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

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

*/

public class Solution {
    static List<Integer>ans;
    public static void postorder(TreeNode root){
        if(root ==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        ans.add(root.data);
    }
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        ans=new ArrayList<>();
        postorder(root);
        return ans;
    }
}