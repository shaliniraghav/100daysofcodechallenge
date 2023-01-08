📌Topic:-Array

📌SubTopic:-Set Mismatch

📌Description:-
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
  
📌test Case 1:-  
Input:- nums = [1,2,2,4]
Output:- [2,3]

📌TestCase 2:-
Input:- nums = [1,1]
Output:- [1,2]
 
📌Constraints:-
2 <= nums.length <= 10^4
1 <= nums[i] <= 10^4

📌Code:-
public class Solution {
public int[] findErrorNums(int[] number) {
int dupli = -1, lost = -1;
for (int m = 1; m <= number.length; m++) {
int count = 0;
for (int n = 0; n < number.length; n++) {
if (number[n] == m)
count++;
}
if (count == 2)
dupli = m;
else if (count == 0)
lost = m;
}
return new int[] {dupli, lost};
}
}
