📌Topic:Array
📌SubTopic:Converted Array to Binary Search Array
📌Description:Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

📌 TestCase 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

📌TestCase 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

📌Constraints:
1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums is sorted in a strictly increasing order.
  
 📌Code:
public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {

	return makeBST(nums, 0, nums.size() - 1);
}

TreeNode* makeBST(vector<int>& nums, int start, int end) { 
	// if end > start, no elements left to makeBST
	if (start > end) { return nullptr; }
	
	// if start==end, we are left at the last element
	if (start == end) {
		TreeNode* newNode = new TreeNode(nums[start]);
		return newNode;
	}
	
	// calc mid
	int mid = (start + end) / 2;
	int val = nums[mid];
	TreeNode* left = makeBST(nums, start, mid - 1);
	TreeNode* right = makeBST(nums, mid + 1, end);
	
	// joining left and right node to the root.
	TreeNode* newNode = new TreeNode(val, left, right);

	return newNode;
} 
};
