package com.practice.problem.leetcode;


import java.util.Map;

/**
 * 868. Binary Gap
 * <ul>
 * Question Link: https://leetcode.com/problems/binary-gap/description/
 * </ul>
 * <p>
 * Given a positive integer n, find and return the longest distance between any two adjacent 1's
 * in the binary representation of n. If there are no two adjacent 1's, return 0.
 *
 * <p>
 * Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
 * The distance between two 1's is the absolute difference between their bit positions.
 * For example, the two 1's in "1001" have a distance of 3.
 * <p/>
 *
 * <ul>
 * Example 1
 *    Input: n = 22
 *    Output: 2
 *    Explanation: 22 in binary is "10110".
 *                 The first adjacent pair of 1's is "10110" with a distance of 2.
 *                 The second adjacent pair of 1's is "10110" with a distance of 1.
 *                 The answer is the largest of these two distances, which is 2.
 *                 Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.
 * <p>
 * Example 2
 *    Input: n = 8
 *    Output: 0
 *    Explanation: 8 in binary is "1000".
 *                 There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.
 * <ul/>
 * <p>
 * Constraints: 1 <= n <= 10^9
 */
public class LeetCode868 {

  public static void main(String[] args) {
    int array[] = {17, 22, 8, 5};
    for (int x : array) {
      System.out.println("for " + x + " : " + Integer.toBinaryString(x) + " -> " + binaryGap(x));
    }
  }

  public static int binaryGap(int n) {
    int res = 0;
    int index = 0;
    int prevIndex = -1;
    while (n > 0) {
      if ((n & 1) == 1) {
        if (prevIndex != -1) {
          res = Math.max(res, (index - prevIndex));
        }
        prevIndex = index;
      }
      index++;
      n >>= 1;
    }
    return res;
  }
}
