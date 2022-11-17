Topic:Array
SubTopic:Contain Duplicate-2
Description:
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

TestCase 1:
Input: nums = [1,2,3,1], k = 3
Output: true

TestCase 2:
Input: 
nums = [1,0,1,1], k = 1
Output:
true

TestCase 3:
Input: 
nums = [1,2,3,1,2,3], k = 2
Output:
false
 
Constraints:
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
0 <= k <= 10^5
 
Code: 
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            if(i-map.get(nums[i])<=k) return true;
        }
        map.put(nums[i],i);
    }
    
    return false;
} 
    }
