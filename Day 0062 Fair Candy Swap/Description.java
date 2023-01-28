📌Topic:Array
📌Subtopic:Fair Candy Swap
📌Description:Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

📌Testcase 1:
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

📌Testcase 2:
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

📌Testcase 3:
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
 

📌Constraints:
1 <= aliceSizes.length, bobSizes.length <= 10^4
1 <= aliceSizes[i], bobSizes[j] <= 10^5
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.
  
📌Code:
class Solution {
    public int[] fairCandySwap(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
        }
        int mid = ( sum1 - sum2 ) / 2;
        Set<Integer> s2 = new HashSet<>();

        for(int i=0;i<arr2.length;i++){
            s2.add(arr2[i]);
        }

        for(int v : arr1){
            if( s2.contains(v-mid)){
                return new int[] {v,v-mid};
            }
        }
        return new int[] {0,0};
        }
}
