class Solution {
    // public int maxDepth(TreeNode root) {
    //     int level=0;
    //     Queue<TreeNode> que= new LinkedList<>();
    //     if(root==null) return 0;
    //     que.offer(root);
    //     while(!que.isEmpty()){
    //         int size= que.size();
    //         while(size>0){
    //             TreeNode node=que.poll();
    //             size--;
    //             if(node.left!=null){
    //                 que.offer(node.left);
    //             }
    //             if(node.right!=null){
    //                 que.offer(node.right);
    //             }
    //         }
    //         if(!que.isEmpty()){
    //             level++;
    //         }
    //     }
    //     return level+1;
    // }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return (1+ Math.max(lh,rh));
    }
}