// Problem: Subarray sum equals K
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Prefix sum + hashmap

// Approach:
// prefix sum+hashmap with a bit of tweak

// Time Complexity: O(n)
// Space Complexity: O() //basically whatever hashmap takes


import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0; int count=0; int sum=0;
        map.put(0, 1);
        while(i<nums.length){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            i++;
        }
        return count;
    }  
}