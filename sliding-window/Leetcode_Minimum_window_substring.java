// Problem: Minimum window substring 
// Given two strings s and t of lengths m and n respectively, return the minimum 
// window of s such that every character in t (including duplicates) is included in the window. 
// If there is no such substring, return the empty string "".

// Platform: LeetCode
// Difficulty: Hard
// Topic: Sliding Window, Strings

// Approach:
// Preload a hashmap with counts of string t, also maintain the frequency
// Expand a window over string s
// Track a count variable to know when all required chars are matched



// Time Complexity: O(n+m)
// Space Complexity: O(k)  // k = number of unique characters in s ∪ t



import java.util.HashMap;
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        while(i<t.length()){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) +1);
            i++;
        }
        int r=0; int l=0; int count=0; int minlen = Integer.MAX_VALUE; int starting_char=-1;

        while(r<s.length()){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) > 0){
                count++;
            }

            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)-1);
            
            while(count == t.length()){
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    starting_char = l;
                }

                map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)+1);

                if(map.get(s.charAt(l)) > 0){
                    count--;
                }

                l++;
            }
            r++;
        }
        if(starting_char==-1){
            return "";
        }
        int ending_char = starting_char + minlen;
        String str = s.substring(starting_char, ending_char);
        return str;
    }
}
    
