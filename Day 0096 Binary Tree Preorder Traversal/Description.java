Topic:-Stack
Subtopic:-Binary Tree Preorder Traversal
Description:-Given the root of a binary tree, return the preorder traversal of its nodes' values.

Testcase 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Testcase 2:
Input: root = []
Output: []

Testcase 3:
Input: root = [1]
Output: [1]
 
Constraints:
the number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
  
Code:-
  class Solution {

    public void traversal(TreeNode root, List<Integer> res) {
       
        // Return if the current node is null
        //base case
        if(root == null) return;
        
        // Add the current node's value to the result list
        res.add(root.val);
        
        // Recursively traverse the left and right subtrees
        traversal(root.left, res);
        traversal(root.right, res);
   }

    public List<Integer> preorderTraversal(TreeNode root) {
        // Creating a list to store the traversal result
        //Initialization
        List<Integer> res = new ArrayList<>();
        
        // To perform the traversal
        traversal(root, res);
        
        // Return the result
        return res;
   }
    
}
