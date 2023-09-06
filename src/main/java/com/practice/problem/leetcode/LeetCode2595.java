package com.practice.problem.leetcode;

import java.util.Arrays;

/**
 * 2595. Number of Even and Odd Bits
 * <ul>
 * Question Link: https://leetcode.com/problems/number-of-even-and-odd-bits/description/
 *
 * <p>
 * You are given a positive integer n.
 * <p>
 * Let even denote the number of even indices in the binary representation of n (0-indexed) with
 * value 1. Let odd denote the number of odd indices in the binary representation of n (0-indexed)
 * with value 1. Return an integer array answer where answer = [even, odd].
 * <p/>
 *
 * <ul>
 * Example 1
 *  Input: n = 17
 *  Output: [2,0]
 *  Explanation:  The binary representation of 17 is 10001.
 *                It contains 1 on the 0th and 4th indices.
 *                There are 2 even and 0 odd indices.
 * <p>
 * Example 2
 *  Input: n = 2
 *  Output: [0,1]
 *  Explanation: The binary representation of 2 is 10.
 *               It contains 1 on the 1st index.
 *               There are 0 even and 1 odd indices.
 * <ul/>
 * <p>
 * Constraints: 1 <= n <= 1000
 */

public class LeetCode2595 {

  public static void main(String[] args) {
    int array[] = {17, 13, 2, 9, 8, 31, 38};
    for (int x : array) {
      System.out.println("for " + x + ": " + Arrays.toString(evenOddBit(x)));
    }
  }

  public static int[] evenOddBit(int n) {
    int res[] = new int[2];
    int index = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        if (index % 2 == 0) {
          res[0] = ++res[0];
        } else {
          res[1] = ++res[1];
        }
      }
      index++;
      n >>= 1;
    }
    return res;
  }
}
