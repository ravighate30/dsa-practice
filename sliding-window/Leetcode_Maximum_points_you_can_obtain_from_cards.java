// Problem: Maximum points you can obtain from cards
// There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
// Your score is the sum of the points of the cards you have taken.
// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Two Pointer

// Approach:

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0; int maxSum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        maxSum = sum;
        int n = cardPoints.length-1;
        for(int j=k-1; j>=0; j--){
            sum -= cardPoints[j];
            sum += cardPoints[n];
            maxSum = Math.max(sum, maxSum);
            n--;
        }
    return maxSum;
    }
}