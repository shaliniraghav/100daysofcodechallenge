📌Topic:-Array
📌Subtopic:-Find Lucky Integer in an Array
📌Description:-Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1.

📌Testcase 1:
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

📌Testcase 2:
Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

📌Testcase 3:
Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 
📌Constraints:
1 <= arr.length <= 500
1 <= arr[i] <= 500
  
📌Code:-
 class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int n : arr) {
            count[n]++;
        }
        int max = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) max = i;
        }
        return max;
    }
}
