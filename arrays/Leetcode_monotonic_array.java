//Leetcode easy

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1] > nums[i]){
                isDecreasing = false;
            } else if (nums[i+1] < nums[i]){
                isIncreasing = false;
            }
            
            if(!isIncreasing && !isDecreasing){
                return false;
            } 
        }
        return isIncreasing || isDecreasing;
    }
}