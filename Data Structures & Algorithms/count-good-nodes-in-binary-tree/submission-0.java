/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int c=0;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        explore(root,Integer.MIN_VALUE);
        return c;
    }

    public void explore(TreeNode root,int k){

        if(root==null){
            return;
        }

        if(root.val>=k){
            c++;
        }

        int newmax=Math.max(root.val,k);

        explore(root.left,newmax);
        explore(root.right,newmax);
    }


}
