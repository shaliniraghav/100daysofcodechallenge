Topic:-String
Subtopic:-Isomorphic String
Description:-Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.

Testcase 1:
Input: s = "egg", t = "add"
Output: true

Testcase 2:
Input: s = "foo", t = "bar"
Output: false

Testcase 3:
Input: s = "paper", t = "title"
Output: true
 
Constraints:
1 <= s.length <= 5 * 10^4
t.length == s.length
s and t consist of any valid ascii character.
  
Code:-
 class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m) return false;
        if(s.equals(t)) return true;

        Map<Character, Character> map = new HashMap<>();
     
    for(int i=0; i<n; i++){
        char c = s.charAt(i);
        char d = t.charAt(i);

        if(map.containsKey(c)){
            if(!map.get(c).equals(d)) return false;
        }
        else{

            if(map.containsValue(d)) return false;

            map.put(c, d);
        }

    }
    return true;

    }
}
