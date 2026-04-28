// Problem: Longest consecutive sequence 

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Array, hash-table

// Approach:
// using hashset

// Time Complexity: O(3n)
// Space Complexity: O(n)  

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++; 
                    count++;
                }
                if(count > longest){
                    longest = count;
                }
            }
            
        }
        return longest;
    }
    
}