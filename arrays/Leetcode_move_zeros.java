//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

//TC = O(N)
class Solution {
    public void moveZeroes(int[] nums) {
        int anchor=0;
        for(int scout=0; scout<nums.length; scout++){
            if(nums[scout]!=0){
                if (scout != anchor) {
                    int temp = nums[scout];
                    nums[scout] = nums[anchor];
                    nums[anchor] = temp;
                }
                anchor++;
            }
        }
    }
}