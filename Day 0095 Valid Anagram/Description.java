Topic:-String
Subtopic:-Valid Anagram
Description:-Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Testcase 1:
Input: s = "anagram", t = "nagaram"
Output: true

Testcase 2:
Input: s = "rat", t = "car"
Output: false
 
Constraints:
1 <= s.length, t.length <= 5 * 10^4
s and t consist of lowercase English letters.
  
Code:-
 class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length() != t.length())  return false;

       HashMap<Character, Integer> map = new HashMap<>();
       for(int i=0; i<s.length(); i++){
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) +1);
       }

       for(int i=0; i<t.length(); i++){
           if(!map.containsKey(t.charAt(i)))
           return false;

           if(map.get(t.charAt(i)) == 1)
           map.remove(t.charAt(i));
           else
           map.put(t.charAt(i), map.get(t.charAt(i)) -1);
       }

       if(map.size() == 0)
       return true;
       else return false;
    }
}
