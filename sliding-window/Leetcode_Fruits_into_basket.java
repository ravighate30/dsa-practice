// Problem: Fruits into basket
// Given a string s, find the length of the longest without duplicate characters.// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding window

// Approach:

// Time Complexity: O(n)
// Space Complexity: O(1)
// (map size max = 3 → effectively constant)

import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();  
        int r=0; int l=0; int k=2; int maxlen=0; 
        while(r<fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
            while(map.size()>k){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
}