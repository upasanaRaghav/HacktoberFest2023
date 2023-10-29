//Binary Tree Level Order Traversal

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)return ans;
               
         q.offer(root); 

        while(!q.isEmpty()){
           
            int levelNum=q.size();
           
            List<Integer>subList=new LinkedList<>();
           
            for(int i=0;i<levelNum;i++){
                 
                 if(q.peek().left != null) 
                q.offer(q.peek().left);
                
            if(q.peek().right != null) 
                q.offer(q.peek().right);
                subList.add(q.poll().val);

                    }
                ans.add(subList);
            }
            return ans;
        }
    }

        
