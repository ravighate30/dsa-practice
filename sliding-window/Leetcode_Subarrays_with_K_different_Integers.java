// Problem: Subarrays with k different integers

// Given an integer array nums and an integer k, return the number of good subarrays of nums.
// A good array is an array where the number of different integers in that array is exactly k.
// For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
// A subarray is a contiguous part of an array.

// Platform: LeetCode
// Difficulty: Hard
// Topic: Sliding Window At Most K method

// Approach:
//Please upload the space complexity by replacing hashmap with array in this problem

// Time Complexity: O(2n)
// Space Complexity: O(2k)  // ig??

import java.util.HashMap;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k){
        return subarraysWithKDistinctActual(nums, k) - subarraysWithKDistinctActual(nums, k-1);
    }

    public int subarraysWithKDistinctActual(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int r=0; int l=0; int count =0; 
        while(r<nums.length){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            while(map.size()>k){
                map.put(nums[l], map.getOrDefault(nums[l], 0)-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            if(map.size()<=k){
                count += (r-l+1);
            }
            r++;
        }
        return count;
    }
}
