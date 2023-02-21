📌Topic:Array
📌SubTopic:Pascel's Triangle ||
📌Description:Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

📌TestCase 1:

Input: rowIndex = 3
Output: [1,3,3,1]

📌TestCase 2:

Input: rowIndex = 0
Output: [1]

📌TestCase 3:

Input: rowIndex = 1
Output: [1,1]
 

📌Constraints:

0 <= rowIndex <= 33

📌Code:
class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> v;
        long long int val=1;
        for(int i=0; i<=rowIndex; i++){
            v.push_back(val);
            val = val*(rowIndex-i)/(i+1);
        }
        return v;
    }
};
