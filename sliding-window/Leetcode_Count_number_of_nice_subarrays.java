// Problem: Count number of nice subarrays
// Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
// Return the number of nice sub-arrays.
// A subarray is a contiguous part of the array.

// Platform: Leetcode
// Difficulty: Medium
// Topic: Sliding window, At most K method

// Approach: At most k method
// Time Complexity: O(2n)
// Space Complexity: O(1)

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return numberOfSubarraysActual(nums, k) - numberOfSubarraysActual(nums, k-1);
    }

    public int numberOfSubarraysActual(int[] nums, int k) {
        if(k<0) return 0;
        int r=0; int l=0; int oddelements=0; int count=0;
        while(r<nums.length){
            if(nums[r]%2 != 0){
                oddelements++;
            }
            while(oddelements>k && l<nums.length){
                if(nums[l]%2 != 0){
                    oddelements--;
                }
                l++;
            }
            if(oddelements<=k){
                count += (r-l+1);
            }
            r++;
        }
        return count;
    }
}