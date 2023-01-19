📌Topic: Array
📌Subtopic: Can place FLowers
📌Description:
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

📌Testcase 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

📌Testcase 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

📌Constraints:
1 <= flowerbed.length <= 2 * 10^4
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length

📌Code:
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length ;
        if(len == 1 && flowerbed[0] == 0) return true ;
        int res = 0 , cnt = 0 , i = 0 ;
        if(len >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0) {res++ ; i = 1 ;}
        if(len >= 3 && flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {res++ ; len-- ;}
        
        while(i < len) {
            if(flowerbed[i++] == 1) {
                if(cnt >= 3) res = 1 + (cnt - 3) / 2 + res ;  
                cnt = 0 ;
            }
            else cnt++ ;
        }
        if(cnt >= 3) res = 1 + (cnt - 3) / 2 + res ;
        return res >= n ;
    }
}
