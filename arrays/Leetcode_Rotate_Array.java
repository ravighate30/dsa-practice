// Rotate Array
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Array, two pointers

// Approach:

// Time Complexity: O(2n)
// Space Complexity: O(1)


class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(nums.length>1){
            rotateHelp(nums, 0, nums.length-k-1);
            rotateHelp(nums, nums.length-k, nums.length-1);
            rotateHelp(nums, 0, nums.length-1);
        }
    }

    public int[] rotateHelp(int[] nums, int a, int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
        return nums;
    }
}