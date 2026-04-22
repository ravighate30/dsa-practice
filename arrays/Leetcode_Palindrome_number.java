// Problem: Palindrome number
// Given an integer x, return true if x is a , and false otherwise.// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Platform: LeetCode
// Difficulty: Easy
// Topic: 

// Approach:
// do it without converting the integer to string

// Time Complexity: O(log10​(n))
// Space Complexity: O() //


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=x;
        int digit=0;
        int reversed=0;
        
        while(y>0){
            digit = y%10;
            reversed = reversed*10 + digit;
            y=y/10;
        }  
        return reversed == x;
    }
}