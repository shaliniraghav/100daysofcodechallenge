📌Topic:Array
📌SubTopic:Single Number
📌Description:Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

📌TestCase 1:
Input: nums = [2,2,1]
Output: 1

📌TestCase 2:
Input: nums = [4,1,2,1,2]
Output: 4

📌TestCase 3:
Input: nums = [1]
Output: 1
 

📌Constraints:
1 <= nums.length <= 3 * 10^4
-3 * 10^4 <= nums[i] <= 3 * 10^4
Each element in the array appears twice except for one element which appears only once.
  
📌Code:
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) 
            return nums[0];
    for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
   return nums[nums.length - 1];
    }
}  
