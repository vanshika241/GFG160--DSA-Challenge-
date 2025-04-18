class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> res = new ArrayList<>();
            while(size>0){
                Node curr = q.poll();
                res.add(curr.data);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                size--;
            }
            ans.add(res);
        }
        return ans;
    }
}
