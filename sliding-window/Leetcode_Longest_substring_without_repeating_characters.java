// Problem: Longest substring without repeating characters
// Given a string s, find the length of the longest without duplicate characters.// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding window

// Approach:
// really simple approach, we simply move right pointer and adding it into hashmap with its index,
// if it existed before we first check if the element is repeating in our current substring or not, because 
// no point in shrinking window if the character has not repeating in our substring but existed way before, 
// to check that we see the index of that character stored in hashmap is greater than l or not, if it is not then the 
// character does not exists in current substring and we are good to go
//lowkey this approach is more easier and intuitive than strivers approach, but still works completely fine. or actually the
// technique to solve this looks exact same but I am happy I found the way to solve it on my own

// Time Complexity: O(n)
// Space Complexity: O(min(n, charset))

import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0; int r=0; int maxlen=0; 
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) >= l){
                     l=map.get(s.charAt(r))+1;
                }
            }
            map.put(s.charAt(r), r);
            if(maxlen<(r-l+1)){
                maxlen = r-l+1;
            }
            r++;
        }
        return maxlen;
    }
}
