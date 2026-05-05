// leetcode easy

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        while(i<nums.length-1){
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}