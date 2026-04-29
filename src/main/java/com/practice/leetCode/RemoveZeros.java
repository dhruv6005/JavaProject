package com.practice.leetCode;

/*
3726. Remove Zeros in Decimal Representation
You are given a positive integer n.
Return the integer obtained by removing all zeros from the decimal representation of n.

Example 1:
Input: n = 1020030
Output: 123

Explanation:
After removing all zeros from 1020030, we get 123.

Example 2:
Input: n = 1
Output: 1

Explanation:
1 has no zero in its decimal representation. Therefore, the answer is 1.

Constraints:
1 <= n <= 1015
 */

public class RemoveZeros {

    static long removeZeros(long n) {

        long l = 0;
        long multiplier = 1;

        while (n != 0) {
            if (n % 10 != 0) {
                l = l + ((n % 10) * multiplier);
                multiplier = multiplier * 10;
            }

            n = n / 10;
        }

        return l;
    }

    public static void main(String[] args) {
        long l = removeZeros(1020030);
        System.out.println("After Removing Zeros : " + l);
    }
}
