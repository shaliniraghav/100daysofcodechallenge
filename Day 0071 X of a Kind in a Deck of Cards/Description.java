📌Topic:-Array
📌Subtopic:-X of a Kind in a Deck of Cards
📌Description:-You are given an integer array deck where deck[i] represents the number written on the ith card.
Partition the cards into one or more groups such that:
Each group has exactly x cards where x > 1, and
All the cards in one group have the same integer written on them.
Return true if such partition is possible, or false otherwise.

📌Testcase 1:
Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].

📌Testcase 2:
Input: deck = [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.
 
📌Constraints:
1 <= deck.length <= 10^4
0 <= deck[i] < 10^4

📌Code:-
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int gcd = 0;
        for (int val : map.values()) {
            gcd = gcd(gcd, val);
        }

        return gcd > 1;
    }

    public int gcd(int a, int b) {
        return (b == 0)? a : gcd(b, a % b);
    }
}
