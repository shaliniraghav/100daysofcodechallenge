Topic:-String
Subtopic:-Remove duplicates Letter
Description:-Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
among all possible results.

TestCase1:
Input: s = "bcabc"
Output: "abc"

TestCase 2:
Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:
1 <= s.length <= 10^4
s consists of lowercase English letters.
  
  
Code:-
Class  Solution {
     public String removeDuplicateLetters(String s) {
    Stack<Character> stack = new Stack<>();
    int[] count = new int[26];
    char[] arr = s.toCharArray();
    for(char c : arr) {
        count[c-'a']++;
    }
    boolean[] visited = new boolean[26];
    for(char c : arr) {
        count[c-'a']--;
        if(visited[c-'a']) {
            continue;
        }
        while(!stack.isEmpty() && stack.peek() > c && count[stack.peek()-'a'] > 0) {
            visited[stack.peek()-'a'] = false;
            stack.pop();
        }
        stack.push(c);
        visited[c-'a'] = true;
    }
    StringBuilder sb = new StringBuilder();
    for(char c : stack) {
        sb.append(c);
    }
    return sb.toString();
}   
    }
