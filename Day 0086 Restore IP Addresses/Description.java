Topic:-Array
Subtopic:-Restore IP Addresses
Description:-A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.

TestCase 1:
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]

TestCase 2:
Input: s = "0000"
Output: ["0.0.0.0"]

TestCase 3:
Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 
Constraints:
1 <= s.length <= 20
s consists of digits only.
  
Code:-
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length() > 12) {      
            return ans;
        }

        int len = s.length();
        StringBuilder sb = new StringBuilder(); 
        for (int l1 = 1; l1 <= 3; l1++) {
            for (int l2 = 1; l2 <= 3; l2++) {
                for (int l3 = 1; l3 <= 3; l3++) {
                      int l4 = len - l1 - l2 - l3;
                    if (l4 > 0 && l4 <= 3) {    // if it is
                         int p1 = getNum(s, 0, l1);
                        int p2 = getNum(s, l1, l1 + l2);
                        int p3 = getNum(s, l1 + l2, l1 + l2 + l3);
                        int p4 = getNum(s, l1 + l2 + l3, l1 + l2 + l3 + l4);
                        if (p1 <= 255 && p2 <= 255 && p3 <= 255 && p4 <= 255) {
                            sb.append(p1).append(".").append(p2).append(".")
                            .append(p3).append(".").append(p4);
                            
                            
                            if (sb.length() == len + 3) {    
                                ans.add(sb.toString());    
                            }
                            
                            sb = new StringBuilder();
                        }
                    }
                }
            }
        }

        return ans;
    }
  private int getNum(String s, int i, int j) {
        return Integer.parseInt(s.substring(i, j));
    }
}
