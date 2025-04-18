class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        int n = inorder.length;
        int m = preorder.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(inorder[i],i);
        }
        Node root = buildtree(preorder,0,m-1,inorder,0,n-1,mp);
        return root;
    }
    
    public static Node buildtree(int preorder[],int preStart,int preEnd,
    int inorder[], int iStart,int iEnd,HashMap<Integer,Integer> mp){
       if(preStart>preEnd || iStart>iEnd) return null;
       Node root = new Node(preorder[preStart]);
       int iRoot = mp.get(root.data);
       int num = iRoot-iStart;
       root.left =  buildtree(preorder,preStart+1,preStart+num,inorder,iStart,iRoot-1,mp);
       root.right =  buildtree(preorder,preStart+num+1,preEnd,inorder,iRoot+1,iEnd,mp);
       return root;
    }
}
