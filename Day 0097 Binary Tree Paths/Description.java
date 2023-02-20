Topic:-String 
Subtopic:-Binary Tree Paths
Description:-
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children
https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg
TestCase 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

TestCase 2:
Input: root = [1]
Output: ["1"]
 
Constraints:
The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
  
Code:-
 class Solution {
   
        public List<String> binaryTreePaths(TreeNode root) {
    List<String> answer = new ArrayList<String>();
    if (root != null) searchBT(root, "", answer);
    return answer;
}
private void searchBT(TreeNode root, String path, List<String> answer) {
    if (root.left == null && root.right == null) answer.add(path + root.val);
    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
}
 } 
