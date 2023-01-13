📌Topic:Array

📌Subtopic:Maximum XOR of Two Numbers

📌Description:Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.

📌Testcase 1:
Input: nums = [3,10,5,25,2,8]
Output: 28
Explanation: The maximum result is 5 XOR 25 = 28.

📌Testcase 2:
Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
Output: 127
 
📌Constraints:
1 <= nums.length <= 2 * 10^5
0 <= nums[i] <= 2^31 - 1
  
📌Code:
public class Solution {
    public int findMaximumXOR(int[] nums){
        int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for(int prefix : set){
                if(set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}
  
  
