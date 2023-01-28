📌Topic:Array
📌Subtopic:Degree of an Array
📌Description:Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

📌Testcase 1:
Input: nums = [1,2,2,3,1]
Output: 2

📌Testcase 2: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
📌Testcase 2:
Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation: 
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
 
📌Constraints:
nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
  
📌Code:
class Solution {
    public int findShortestSubArray(int[] nums) {
       
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{i, i, 1});
            } 

            
            else {
                int[] arr = map.get(nums[i]);
                arr[1] = i;
                arr[2]++;
                map.put(nums[i], arr);
            }
        }
        
        int maxFreq = Integer.MIN_VALUE;

        int minDist = Integer.MAX_VALUE;

        for(int[] value : map.values()){
            
            if(value[2] > maxFreq){
                maxFreq = value[2];
                minDist = value[1] - value[0] + 1;
            } 

            
            else if(value[2] == maxFreq){
                minDist = Math.min(minDist, value[1] - value[0] + 1);
            }
        }
        return minDist;
    }
}
