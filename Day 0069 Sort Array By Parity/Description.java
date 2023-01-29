📌Topic:-Array
📌Subtopic:-Sort Array By Parity
📌Description:-Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

📌Testcase 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

📌Testcase 2:
Input: nums = [0]
Output: [0]
 
📌Constraints:
1 <= nums.length <= 5000
0 <= nums[i] <= 5000
  
📌Code:-
 class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j;) {
            if (nums[i] % 2 == 1) {
                int x = nums[i];
                nums[i] = nums[j];
                nums[j] = x;
                --j;
            } else {
                ++i;
            }
        }
        return nums;
    }
} 
