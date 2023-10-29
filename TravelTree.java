class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<Integer>q=new LinkedList<>();
        q.push(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                List<Integer>subList=new ArrayList<>();
                TreeNode node=q.front();
                q.pop();
                int index=(leftToRight)?i:(n-i-1);
                 sublist[index]=node.val;
                 if(node.left)
                 q.push(node.left);
                  if(node.right)
                 q.push(node.right);
                 leftToRight=!leftToRight;
                 ans.add(subList);

            }
        }
        return ans;


    }
}
