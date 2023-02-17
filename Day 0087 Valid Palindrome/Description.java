Topic:-String
Subtopic:-Valid Palindrome
Description:-A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

TestCase 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

TestCase 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

TestCase 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 
Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
  
Code:-
class Solution {
    public boolean isPalindrome(String s) {
        String newStr="";
        String revStr="";
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch <=122)){
                if(ch>=65 && ch<=90) ch= (char) (ch+32);
                newStr += ch;
                revStr = ch+revStr;
            }
        }
        return (revStr.equals(newStr)) ? true: false;
    }
}
