/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:--
Input: nums = [2,2,1]
Output: 1

Example 2:--
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:--
Input: nums = [1]
Output: 1

Constraints:--
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */


public class Solution {
    public static int singleNumber(int[] nums) {
        int count = nums[0];
        if(nums.length==1){
            return count;
        }
        bubble(nums);
        for (int i = 0; i < nums.length; i++) {
            int j;
            for (j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j] && i!=j)
                    break;
            }
            if (j==nums.length)
                count = nums[i];

        }
        return count;
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}
