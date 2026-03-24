package com.practice.leetCode;

/*
2535. Difference Between Element Sum and Digit Sum of an Array
Easy
Topics
premium lock icon
Companies
Hint
You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.



Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.


Constraints:

1 <= nums.length <= 2000
1 <= nums[i] <= 2000
 */
public class DifferenceOfSum {

    public static int differenceOfSum(int[] nums) {
        int arraySum = 0;
        int digitSum = 0;
        for (int num : nums) {
            arraySum += num;
            int digit = num;
            while (digit > 9) {
                digitSum += (digit % 10);
                digit /= 10;
            }
            digitSum += digit;
        }
        return arraySum - digitSum;
    }

    public static void main(String[] args) {
        int[] num = {3, 6, 15, 14, 17, 12, 9, 9, 15, 3, 13, 5, 18, 13, 18, 17, 5, 14, 7, 20};
        int sum = differenceOfSum(num);
        System.out.println(sum);
    }
}
