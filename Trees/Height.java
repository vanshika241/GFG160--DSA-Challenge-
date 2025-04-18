class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node == null)return -1;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
}
