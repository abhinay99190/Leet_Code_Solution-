/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:--
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:--
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:--
Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:--
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int mid =0;
        int end = nums.length-1;
        while (start <= end){
             mid = start + (end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return nums[mid]>target?mid:mid+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        int ans = searchInsert(nums,target);
        System.out.println(ans);
    }
}
