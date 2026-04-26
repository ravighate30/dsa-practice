// Sort colors (0,1,2) // Dutch national flag algorithm

// Platform: LeetCode
// Difficulty: Medium
// Topic : Dutch national flag algorithm

// Approach: anchor and scout technique, dutch national flag algorithm

// Time Complexity: O(n)
// Space Complexity: O() //whatever the extra array takes

class Solution {

    public void sortColors(int[] nums) {
        int low=0; int mid=0; int high=nums.length-1;
        while (mid<=high) {
            if (nums[mid]==1) {
                mid++;
            } else if (nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            } else if (nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
        }
    }
}