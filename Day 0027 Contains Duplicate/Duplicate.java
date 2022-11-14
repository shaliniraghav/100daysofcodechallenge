📌Topic:Array
📌SubTopic:Contain Duplicate
📌Description:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

📌Testcase 1:
Input: nums = [1,2,3,1]
Output: true

📌Testcase 2:
Input: nums = [1,2,3,4]
Output: false

📌Testcase 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
📌Constraints:
1 <= nums.length <= 10^5
-109 <= nums[i] <= 10^9

📌Code:
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
