📌Topic:Array

📌SubTopic:Binary Search

📌Description:
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, retur 1:

📌TestCase 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

📌TestCase 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 

📌Constraints:
1 <= nums.length <= 10^4
-10^4 < nums[i], target < 10^4
All the integers in nums are unique.
nums is sorted in ascending order.
  
📌Code:  
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
         while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            
            else if(target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}  
  
