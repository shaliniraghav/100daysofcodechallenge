📌Topic:-Array

📌SubTopic:-Two sum

📌Description:-Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

📌Constraints:-
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

📌Test case-1:-nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

📌Test case-2:-nums = [3,2,4], target = 6
Output: [1,2]

📌Test case-3:- nums = [3,3], target = 6
Output: [0,1]

📌*****code*****
 class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        for(int i=0;i<nums.size()-1;i++)
        {
            for(int j=i+1;j<nums.size();j++)
                if(nums[i]+nums[j]==target) return{i,j};
        }
        return {};
    }
};
