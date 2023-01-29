📌Topic:-Array
📌Subtopic:-DI String Match
📌Description:-A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

📌Testcase 1:
Input: s = "IDID"
Output: [0,4,1,3,2]

📌Testcase 2:
Input: s = "III"
Output: [0,1,2,3]

📌Testcase 3:
Input: s = "DDI"
Output: [3,2,0,1]
 
📌Constraints:
1 <= s.length <= 105
s[i] is either 'I' or 'D'.
  
📌Code:-
class Solution {

    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        int start = 0;
        int end = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = start++;
            } else {
                perm[i] = end--;
            }
        }
        perm[n] = start;

        return perm;
    }
}  
