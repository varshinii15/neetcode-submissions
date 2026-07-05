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
    int p=0;
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder,inorder,Integer.MIN_VALUE);
    }

    public TreeNode build(int[] preorder, int[] inorder,int k){

        if(p>=preorder.length){
            return null;
        }

        if(inorder[i]==k){
            ++i;
            return null;
        }

        TreeNode root=new TreeNode(preorder[p++]);
        root.left=build(preorder,inorder,root.val);
        root.right=build(preorder,inorder,k);

        return root;
    }
}
