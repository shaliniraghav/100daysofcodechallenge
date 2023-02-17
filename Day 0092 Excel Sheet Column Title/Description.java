Topic:-String
Subtopic:-Excel Sheet Column Title
Description:-Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 
Testcase 1:
Input: columnNumber = 1
Output: "A"

Testcase 2:
Input: columnNumber = 28
Output: "AB"

Testcase 3:
Input: columnNumber = 701
Output: "ZY"
 

Constraints:
1 <= columnNumber <= 2^31 - 1
  
Code:-
class Solution {
    public String convertToTitle(int n) {
      String result = "";
       
       while(n > 0) {
           n --;
           result = (char)('A' + (n % 26)) + result;
           n = n / 26;
       }
       return result;
    }
}
