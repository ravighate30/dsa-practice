// Problem: Furthest point from origin
// You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.

// In the ith move, you can choose one of the following directions:
//  move to the left if moves[i] = 'L' or moves[i] = '_'
//  move to the right if moves[i] = 'R' or moves[i] = '_'
// Return the distance from the origin of the furthest point you can get to after n moves.

// Platform: LeetCode
// Difficulty: Easy
// Topic: String

// Approach:

// Time Complexity: O(n) 
// Space Complexity: O()

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int numberL=0; int numberR=0; int numberDash=0;
        int i=0;
        while(i<moves.length()){
            if(moves.charAt(i)=='L'){
                numberL++;
            } else if(moves.charAt(i)=='R'){
                numberR++;
            } else {
                numberDash++;
            }
            i++;
        }
        return numberL>=numberR ? numberL+numberDash-numberR : numberR+numberDash-numberL; 
    }
}