// Replace Elements with Greatest Element on Right Side

// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

// After doing so, return the array.

// Platform: LeetCode
// Difficulty: easy
// Topic: Array

// Approach:

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int greatest = arr[n-1];
        int i = n-2;
        while(i>=0){
            if(arr[i] < greatest){
                arr[i] = greatest;
            } else {
                int temp = arr[i];
                arr[i] = greatest;
                greatest = temp;
            }
            i--;
        }
        arr[n-1] = -1;
        return arr;
    }
}