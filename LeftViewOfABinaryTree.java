import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer>ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n= q.size();
            
            for(int i=1;i<=n;i++){
                TreeNode<Integer> temp = q.poll();
                
                if(i == 1){
                    ans.add(temp.data);
                }

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                        q.add(temp.right);
                }
            }
        }
        return ans;
    }
}
