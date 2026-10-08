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
    public boolean isEvenOddTree(TreeNode node) {
        boolean isEven=true;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int len=queue.size();
            int prev= (isEven)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0; i<len;i++){
                node = queue.poll();
                if((isEven && (node.val%2==0||node.val<=prev))||(!isEven && (node.val%2!=0||node.val>=prev))){
                    return false;
                }
                prev=node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            isEven=!isEven;
        }
        return true;
    }
}