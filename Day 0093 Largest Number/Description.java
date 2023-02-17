Topic:-String
Subtopic:-Largest Number
Description:-Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.

Testcase 1:
Input: nums = [10,2]
Output: "210"

Testcase 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"
 
Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 10^9

Code:-
class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];         
        for(int i=0; i<nums.length; i++)  s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        return s[0].equals("0") ? "0" : String.join("",s);
    }
}
