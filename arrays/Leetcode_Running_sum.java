// Problem: running sum
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums. // we have to return an array

// Platform: LeetCode
// Difficulty: Easy
// Topic: 

// Approach:

// Time Complexity: O(n)
// Space Complexity: O() //whatever the extra array takes

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum=0; int i=0;
        while(i<nums.length){
            sum+=nums[i];
            runningSum[i] = sum;
            i++;
        }
        return runningSum;
    }
}