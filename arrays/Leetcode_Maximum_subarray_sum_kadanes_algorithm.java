// Problem: Maximum subarray sum, KADANES ALGORITHM 
// Given an integer array nums, find the with the largest sum, and return its sum.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Kadanes algorithm

// Approach:
// solve using kadanes algorithm

// Time Complexity: O(n)
// Space Complexity: O(1)  

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}

// down below is slightly, only slightly better implementation (its not mine)
        // int maxSum = Integer.MIN_VALUE;
        // int sum = 0;

        // for(int i=0; i<nums.length; i++) {
        //     sum += nums[i];
        //     maxSum = sum > maxSum ? sum : maxSum;

        //     sum = sum < 0 ? 0 : sum;
        // }

        // return maxSum;