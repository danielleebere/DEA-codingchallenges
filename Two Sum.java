//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] solution = new int[2]; //created an array of size 2, to store the indices of the two numbers that sum to target
        
        for(int i = 0; i<nums.length; i++){ //nested for loop to iterate through the nums array
            for(int j = i+1; j<nums.length; j++){ //made j = i+1, to avoid adding the same index values together
                if(nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }
        
        return solution;
    }
}
