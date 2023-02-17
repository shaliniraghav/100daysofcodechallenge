Topic:-String
Subtopic:-Reverse Words in a String
Description:-Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. 
Do not include any extra spaces.

TestCase 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

TestCase 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

TestCase 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 
Constraints:
1 <= s.length <= 10^4
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.

Code:-
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder("");
        int pt2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(pt2 < s.length() && s.charAt(pt2) == ' '){
                while(pt2 < s.length() && s.charAt(pt2) == ' '){
                    pt2++;
                    i = pt2-1;
                }
            }else if(pt2 < s.length()){
                while(pt2 < s.length() && s.charAt(pt2) != ' '){
                    pt2++;
                }
                res.insert(0,s.substring(i,pt2) + " ");
            }
        }
        return res.toString().trim();
    }
}
