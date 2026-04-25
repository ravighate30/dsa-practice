//Leetcode : Easy

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

//Aproach : They don't really want you to remove the duplicates. They want you to sort the uniques at the front, then return the length of the sorted part. Then, behind the scenes, they slice the array at the length you give them and the result of that is what they check.

//Tc : O(N)
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0; // j=anchor i=scout
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}