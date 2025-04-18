class Solution {
    public int height(Node root){
        if(root == null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root == null)return true;
         int lh = height(root.left);
        int rh = height(root.right);
        if(Math.abs(lh-rh)>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
