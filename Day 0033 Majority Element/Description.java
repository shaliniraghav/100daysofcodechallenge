Topic:Array

SubTopic:Majority ELement

Description:
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Testcase 1:

Input: nums = [3,2,3]
Output: 3

Testcase 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
Constraints:

n == nums.length
1 <= n <= 5 * 104
-10^9 <= nums[i] <= 10^9
 
Code:
class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
