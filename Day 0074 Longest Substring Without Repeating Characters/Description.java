Topic:-String
SubTopic:-Longest Substring Without Repeating Characters
Description:-Given a string s, find the length of the longest substring without repeating characters.

TestCase 1:-
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

TestCase 2:-
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

TestCase 3:-
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
Constraints:-
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
  
Code:-
class Solution {
     public int lengthOfLongestSubstring(String s) {
    final int n = s.length();
    int len = 0;
    int [] repeat = new int[128];
    for (int c = 0, j = 0, i = 0; j < n; j++) {
        c = s.charAt(j);
        i = Math.max(repeat[c], i);
        len = Math.max(len, j - i +1);
        repeat[c] = j+1;
    }
    return len;
}   
}
