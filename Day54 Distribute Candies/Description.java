📌Topic: Array

📌Subtopic:Distribute Candies

📌Description:Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

 

📌Testcase 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3
Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

📌Testcase 2:
Input: candyType = [1,1,2,3]
Output: 2
Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.

📌Testcase 3:
Input: candyType = [6,6,6,6]
Output: 1
Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.
 

📌Constraints:
n == candyType.length
2 <= n <= 10^4
n is even.
-10^5 <= candyType[i] <= 10^5


📌Code:
class Solution {
    public int distributeCandies(int[] candyType) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<candyType.length; i++)
        {
            map.put(candyType[i], map.getOrDefault(candyType[i], 0)+1);
        }
        
        int permit = candyType.length / 2;
        
        if(map.size() < permit)
        {
            return map.size();
        }
        
        return permit;
    }
}   
    
