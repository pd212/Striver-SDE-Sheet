
public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
        TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
 }
class Solution {
    public boolean isSymmetric(TreeNode root) {
      return  findSymmetric(root.left , root.right);
        
    }
    public boolean findSymmetric(TreeNode p , TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            return ((findSymmetric(p.left,q.right)) &&(findSymmetric(p.right,q.left)));                                                 
        }
        return false;
    }
}
