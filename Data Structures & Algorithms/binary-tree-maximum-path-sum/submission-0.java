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

    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return max;
    }

    public int maxSum(TreeNode root){
        if(root==null){
            return 0;
        }

        int LeftMax=maxSum(root.left);
        int RightMax=maxSum(root.right);

        int allPath=root.val+LeftMax+RightMax;

        int leftsub=Math.max(root.val,root.val+LeftMax);
        int rightsub=Math.max(root.val,root.val+RightMax);

        int leftorright=Math.max(leftsub,rightsub);

        int fin=Math.max(leftorright,allPath);

        max=Math.max(max,fin);

        return leftorright;

        


    }
}
