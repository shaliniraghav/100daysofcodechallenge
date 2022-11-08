📌Topic:Array

📌SubTopic:Pascal Triangle

📌Description:Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
  
📌TestCase 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

📌TestCase 2:

Input: numRows = 1
Output: [[1]]
 
📌Constraints:

1 <= numRows <= 30
  
📌 Code:
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
     vector<vector<int>> result;
 for(int line = 1 ; line <= numRows ; line++ ){
     vector<int> lines;
       int value = 1; 
         for( int i = 1 ; i <= line ; i++){
        lines.push_back(value);
         value = value * (line - i) / i;
           }
            result.push_back(lines);
        }
        return result;
    }
};  
   
  
