// Problem: Rearrange array elements by signs
// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the array follows the given conditions:

//     Every consecutive pair of integers have opposite signs.
//     For all integers with the same sign, the order in which they were present in nums is preserved.
//     The rearranged array begins with a positive integer.

// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Two pointers

// Approach:
// anchor and scout

// Time Complexity: O(n)
// Space Complexity: O(n) //

class Solution {

    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posindex = 0;
        int negindex = 1;
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0){
                result[posindex] = nums[i];
                posindex += 2;
            } else {
                result[negindex] = nums[i];
                negindex += 2;
            }
            i++;
        }
        return result;
    }
}