package com.practice.problem.leetcode;

import java.util.Arrays;

/**
 * Question Link: https://leetcode.com/problems/xor-operation-in-an-array/description/
 *
 * <p>
 * You are given an integer n and an integer start. Define an array nums where nums[i] = start + 2 *
 * i (0-indexed) and n == nums.length. Return the bitwise XOR of all elements of nums.
 * <p/>
 *
 * <ul>
 * Example 1:
 * Input: n = 5, start = 0
 * Output: 8
 * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
 * Where "^" corresponds to bitwise XOR operator.
 * <ul/>
 */
public class XORArray {

  public int xorOperation(int n, int start) {
    //Though question is instructing to define array, but
    // that's not needed as asked is to return XOR of all elements.
    int result = 0; //Identity value for XOR operation.
    for (int i = 0; i < n; i++) {
      result ^= start + (2 * i);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] encoded = {1, 2, 3};
    int first = 1;
    int result = new XORArray().xorOperation(5, 0);
    System.out.println(result);
  }
}
