📌Topic: Array
📌SubTopic:Summary Ranges
📌Description:
You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

📌Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b
 

📌TestCase 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"


📌TestCase 2:
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 

📌Constraints:
0 <= nums.length <= 20
-2^31 <= nums[i] <= 2^31 - 1
All the values of nums are unique.
nums is sorted in ascending order.

📌Code:
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<String>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i ++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1] - 1) {
                result.add(nums[i] + "");
                continue;
            }
            int left = nums[i];
            int j = i + 1;
            for (; j < nums.length; j ++) {
                if (j == nums.length - 1 || nums[j] != nums[j + 1] - 1) {
                    break;
                }
            }
            result.add(left + "->" + nums[j]);
            i = j;
        }
        return result;
    }
}
