// Problem: Maximum consecutive ones
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
// Platform: LeetCode
// Difficulty: Medium
// Topic: Two Pointer , sliding window 

// Approach:

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0; int l=0; int count =0; int maxlen=0;
        while(r<nums.length){
            if(nums[r]==0){
                count++;
            }

            //can use if statement instead of while loop for more optimized solution
            while(count>k){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
}