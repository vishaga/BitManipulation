package com.practice.problem.leetcode;

import java.util.Arrays;

/**
 * Question Link: https://leetcode.com/problems/counting-bits/
 *
 * <p>
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 * <p/>
 *
 * <ul>
 * Example 1
 *  Input: n = 2
 *  Output: [0,1,1]
 *  Explanation:
 *    0 --> 0
 *    1 --> 1
 *    2 --> 10
 * <p>
 * Example 2
 *  Input: n = 5
 *  Output: [0,1,1,2,1,2]
 *  Explanation:
 *    0 --> 0
 *    1 --> 1
 *    2 --> 10
 *    3 --> 11
 *    4 --> 100
 *    5 --> 101
 * <ul/>
 * <p>
 * Constraints: 0 <= n <= 105
 */
public class LeetCode338 {

  public static void main(String[] args) {
    int array[] = {2, 5, 7, 3, 8, 10, 19};
    for (int x : array) {
      System.out.println(Arrays.toString(countBits(x)));
    }
  }

  public static int[] countBits(int n) {
    int res[] = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      int bitSet = 0;
      int value = i;
      while (value > 0) {
        if ((value & 1) == 1) {
          bitSet++;
        }
        value >>= 1;
      }
      res[i] = bitSet;
    }
    return res;
  }
}
