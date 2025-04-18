class Solution {
    public int findHeight(Node root,int maxi[]){
        if(root == null)return 0;
        int lh = findHeight(root.left,maxi);
        int rh = findHeight(root.right,maxi);
        maxi[0] = Math.max(maxi[0],lh+rh);
        return 1+Math.max(lh,rh);
        
    }
    int diameter(Node root) {
        // Your code here
        int maxi[] = new int[1];
        findHeight(root,maxi);
        return maxi[0];
    }
}
