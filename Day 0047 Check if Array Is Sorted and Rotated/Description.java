📌Topic:Array

📌SubTopic:Check if Array Is Sorted and Rotated

📌Description:
Given an array nums, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

📌Testcase 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
  
📌TestCase 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

📌Testcase 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.  
  
📌Code:  
 class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int ctr=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                ctr++;
            }
        }
        if(ctr>1){
                return false;
            }
        return true;
    }
} 
