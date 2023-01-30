import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the TreeNode class:

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


*****************************************************************/

import java.util.ArrayList;

public class Solution {

    public static TreeNode<Integer> bst(ArrayList<Integer> arr,int start,int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode<Integer>(arr.get(start));
        }
        int mid = (start+end)/2;
        TreeNode<Integer>curr = new TreeNode<Integer>(arr.get(mid));

        curr.left = bst(arr, start, mid-1);
        curr.right = bst(arr, mid+1, end);

        return curr;
    }
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        return bst(arr,0,n-1);



    }
}