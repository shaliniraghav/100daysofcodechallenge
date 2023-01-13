📌Topic:Array

📌SubTopic:Max consecutive

📌Description:Given a binary array nums, return the maximum number of consecutive 1's in the array.

📌Testcase 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

📌Testcase 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
 
📌Constraints:
1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
  
📌Code:
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int c=0,mx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c=0;
            }
            else 
            {
                c++;
            }
            mx=Math.max(mx,c);
        }
        return mx;   
    }
}
