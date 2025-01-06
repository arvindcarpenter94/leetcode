/*
https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box
*/
class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        int balls = 0;
        int moves = 0;
        for(int i=0;i<boxes.length();i++){
            moves = balls + moves;
            res[i] = moves;
            balls = balls + Character.getNumericValue(boxes.charAt(i));
        }

        balls = 0;
        moves = 0;
        for(int i=boxes.length()-1;i>=0;i--){
            moves = balls + moves;
            res[i] += moves;
            balls = balls + Character.getNumericValue(boxes.charAt(i));
        }
        return res;
    }
}
