// Problem: Leaders in an array
// You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

// Platform: LeetCode
// Difficulty: Easy
// Topic: arrays

// Approach:

// Time Complexity: O(n)
// Space Complexity: O(1)  

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int greatest = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= greatest){
                list.add(arr[i]);
                greatest = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
