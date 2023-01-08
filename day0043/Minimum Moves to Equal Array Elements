📌Topic:-Array

📌SubTopic:-Minimum Moves to Equal Array Elements

📌Description:-
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment n - 1 elements of the array by 1.

📌Testcase 1:-
Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]

📌Testcase 2:-
Input: nums = [1,1,1]
Output: 0
 
📌Constraints:-
n == nums.length
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
The answer is guaranteed to fit in a 32-bit integer.

📌Code:-
public class Solution {
    public int minMoves(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        for (int n : nums) min = Math.min(min, n);
        int res = 0;
        for (int n : nums) res += n - min;
        return res;
    }
}

