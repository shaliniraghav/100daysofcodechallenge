📌Topic: Array
📌Subtopic:Longest Harmonious Subsequence
📌Description:We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

📌Testcase 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].

📌Testcase 2:
Input: nums = [1,2,3,4]
Output: 3:

📌Testcase 3:
Input: nums = [1,1,1,1]
Output: 0
 

📌Constraints:
1 <= nums.length <= 2 * 10^4
-10^9 <= nums[i] <= 10^9

📌Code:
class Solution {
    public int findLHS(int[] nums) {
    Map<Long, Integer> map = new HashMap<>();
    for (long num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int result = 0;
    for (long key : map.keySet()) {
        if (map.containsKey(key + 1)) {
            result = Math.max(result, map.get(key + 1) + map.get(key));
        }
    }
    return result;
    }
}
