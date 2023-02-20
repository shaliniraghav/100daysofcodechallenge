Topic:-String
Subtopic:-Detect Capital
Description:-
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

TestCase 1:
Input: word = "USA"
Output: true

TestCase 2:
Input: word = "FlaG"
Output: false
 

Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.

Code:-
class Solution {
    public static boolean detectCapitalUse(String word) {
        int l=word.length();
        boolean res= false;
        int c=0;
        for (int i = 0; i <l ; i++) {
            if((int)word.charAt(i)<=90)
                c++;
        }
        if(l==c)
            res=true;
        else
        {
            if(c==1)
            {
                if((int)word.charAt(0)<=90)
                    res=true;
                else
                    res=false;
            }
            if(c==0)
                res=true;
        }
        return res;
    }
}    
    
