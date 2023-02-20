Topic:-String
Subtopic:-Different Ways To Add Parenthes
Description:-
Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.
The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed 104.

TestCase 1:
Input: expression = "2-1-1"
Output: [0,2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2

TestCase 2:
Input: expression = "2*3-4*5"
Output: [-34,-14,-10,-10,10]
Explanation:
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
 

Constraints:
1 <= expression.length <= 20
expression consists of digits and the operator '+', '-', and '*'.
All the integer values in the input expression are in the range [0, 99]

Code:-
  class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new LinkedList<>();
        for(int i=0; i<expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '-' || c == '+' || c == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                for(int a : left) {
                    for(int b : right) {
                        if(c == '-') {
                            res.add(a - b);
                        } else if(c =='+') {
                            res.add(a + b);
                        } else {
                            res.add(a * b);
                        }
                    }
                }
            }
        }
        if(res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}   
   
