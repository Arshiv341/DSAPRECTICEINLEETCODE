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
    public int maxDepth(TreeNode root) {
        int level=0;
        Queue<TreeNode> que= new LinkedList<>();
        if(root==null) return 0;
        que.offer(root);
        while(!que.isEmpty()){
            int size= que.size();
            while(size>0){
                TreeNode node=que.poll();
                size--;
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
            }
            if(!que.isEmpty()){
                level++;
            }
        }
        return level+1;
    }
}