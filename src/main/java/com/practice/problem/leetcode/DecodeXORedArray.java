package com.practice.problem.leetcode;

import java.util.Arrays;

/**
 * Question Link: https://leetcode.com/problems/decode-xored-array/description/
 *
 * <p>
 * There is a hidden integer array arr that consists of n non-negative integers. It was encoded into
 * another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For
 * example, if arr = [1,0,2,1], then encoded = [1,2,3].
 * <p/>
 *
 * <p>
 * You are given the encoded array. You are also given an integer first, that is the first element
 * of arr, i.e. arr[0]. Return the original array arr. It can be proved that the answer exists and
 * is unique.
 * <p>
 *
 * <ul>
 * Example 1:
 * Input: encoded = [1,2,3], first = 1
 * Output: [1,0,2,1]
 * Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
 * <ul/>
 *
 * <ul>
 * *   Example 2: * * Input: encoded = [6,2,7,3], first = 4 * Output: [4,2,0,7,4] * *
 * <ul/>
 *
 * <ul>
 * Constraints: 2 <= n <= 104 encoded.length == n - 1 0 <= encoded[i] <= 105 0 <= first <= 105
 * <ul/>
 */
public class DecodeXORedArray {

  public int[] decode(int[] encoded, int first) {
    int array[] = new int[encoded.length + 1];
    array[0] = first;
    for (int i = 0; i < encoded.length; i++) {
      array[i + 1] = encoded[i] ^ array[i];
    }
    return array;
  }

  public static void main(String[] args) {
    int[] encoded = {1, 2, 3};
    int first = 1;
    int result[] = new DecodeXORedArray().decode(encoded, first);
    System.out.println(Arrays.toString(result));
  }
}
