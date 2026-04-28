// Problem: Minimum Operations to Make a Uni-Value Grid

// You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.

// A uni-value grid is a grid where all the elements of it are equal.

// Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.

// Platform: LeetCode
// Difficulty: Medium/ Leetcode Problem of the day
// Topic: Sorting, Math, Matrix, Array

// Approach:
// using math to avoid while loops

// Time Complexity: O(M×N)+O((M×N)log(M×N))+O(M×N)  ... (grid + sort + flat)
// Space Complexity:O(M×N)

class Solution {
    public int minOperations(int[][] grid, int x) {

        int rows = grid.length;
        int column = grid[0].length;
        int[] flat = new int[rows * column];
        int firstRemainder = grid[0][0] % x;

        int a=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                if (grid[i][j] % x != firstRemainder) return -1;
                flat[a] = grid[i][j];
                // if(flat[a] % x != 0 && flat.length > 1) return -1;
                a++;
            }
        }

        Arrays.sort(flat);
        int mid = flat[flat.length/2];
        
        int count = 0;
        for(int num : flat){

            count += Math.abs(num - mid) / x;
            //the above mathematical implementaion to count operations required to make it equal to mid is much better and efficient than while loops 
            
            // while(num > mid){
            //     num -= x;
            //     count++; 
            // }
            // while(num < mid){
            //     num += x;
            //     count++;
            // }
            // if(num != mid) return -1;
        }

        return count;
    }
}
