package com.practice.problem.leetcode;

/**
 * Question Link: https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 *
 * <p>
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits
 * will always have different values.
 * <p/>
 *
 * <ul>
 *  Example 1:
 * <p>
 *    Input: n = 5
 *    Output: true
 *    Explanation: The binary representation of 5 is: 101
 *  Example 2:
 * <p>
 *    Input: n = 7
 *    Output: false
 *    Explanation: The binary representation of 7 is: 111.
 *  Example 3:
 * <p>
 *    Input: n = 11
 *    Output: false
 *    Explanation: The binary representation of 11 is: 1011.
 * <ul/>
 * <p>
 * Constraints:
 * 1 <= n <= 231 - 1
 */
public class NumberWithAlternateBits {

  public static void main(String[] args) {
    int array[] = {5, 7, 10, 11};
    for(int x: array){
      System.out.println(x + ": " + hasAlternatingBits(x));
    }
  }
  public static boolean hasAlternatingBits(int n) {
    int prevBit = n & 1;
    n >>= 1;
    while(n > 0){
      int currentBit = n & 1;
      if(currentBit == prevBit) return false;
      prevBit = currentBit;
      n >>= 1;
    }
    return true;
  }
}
