package com.practice.leetCode;

import java.util.Arrays;

/*
3774. Absolute Difference Between Maximum and Minimum K Elements
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array nums and an integer k.

Find the absolute difference between:

the sum of the k largest elements in the array; and
the sum of the k smallest elements in the array.
Return an integer denoting this difference.



Example 1:

Input: nums = [5,2,2,4], k = 2

Output: 5

Explanation:

The k = 2 largest elements are 4 and 5. Their sum is 4 + 5 = 9.
The k = 2 smallest elements are 2 and 2. Their sum is 2 + 2 = 4.
The absolute difference is abs(9 - 4) = 5.
Example 2:

Input: nums = [100], k = 1

Output: 0

Explanation:

The largest element is 100.
The smallest element is 100.
The absolute difference is abs(100 - 100) = 0.


Constraints:

1 <= n == nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= n
 */
public class MaxMinDiffInArray {

    public static int absDifference(int[] nums, int k) {
        int maxSum = 0;
        int minSum = 0;

        nums = Arrays.stream(nums).sorted().toArray();

        for (int i = nums.length - k; i < nums.length; i++) {
            maxSum += nums[i];
        }
        for (int i = 0; i < k; i++) {
            minSum += nums[i];
        }
        return Math.abs(maxSum - minSum);
    }

    public static void main(String[] args) {
//        int[] nums = {5, 2, 2, 4};
//        int k =2;
        int[] nums = {100};
        int k = 1;

        System.out.println(absDifference(nums, k));

    }
}
