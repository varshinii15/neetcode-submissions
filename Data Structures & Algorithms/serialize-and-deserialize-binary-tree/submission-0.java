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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        Queue<String> q=new LinkedList<>();
        for(String s:arr){
            q.offer(s);
        }

        return build(q);
    }

    public void preorder(TreeNode root,StringBuilder s){
        if(root==null){
            s.append("#,");
            return;
        }
        s.append(root.val).append(",");
        preorder(root.left,s);
        preorder(root.right,s);
    }

    public TreeNode build(Queue<String> q){

        String s=q.poll();
        if(s.equals("#")){
            return null;
        }

        TreeNode root=new TreeNode(Integer.parseInt(s));
        root.left=build(q);
        root.right=build(q);
        return root;
    }
}
