package com.practice.problem.leetcode;


/**
 * Question Link: https://leetcode.com/problems/a-number-after-a-double-reversal/description/
 *
 * <p>
 * Reversing an integer means to reverse all its digits.
 * <p>
 * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not
 * retained. Given an integer num, reverse num to get reversed1, then reverse reversed1 to get
 * reversed2. Return true if reversed2 equals num. Otherwise return false.
 * <p/>
 *
 * <ul>
 * Example 1:
 * <p>
 *    Input: num = 526
 *    Output: true
 *    Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
 * <ul/>
 *
 * <ul>
 *  * Example 1:
 *  * <p>
 *      Input: num = 1800
 *      Output: false
 *      Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
 *  * <ul/>
 */
public class LeetCode2119 {

  public static void main(String[] args) {
    int array[] = {526, 625, 897, 1800, 210};
    for (int x : array) {
      System.out.println("for " + x + " : " + doubleReverseEqual(x));
    }
  }

  private static boolean doubleReverseEqual(int num) {
    int reverse = reverse(num);
    reverse = reverse(reverse);
    return reverse == num;
  }

  private static int reverse(int num) {
    int res = 0;
    while (num > 0) {
      int mod = num % 10;
      res = res * 10 + mod;
      num /= 10;
    }
    return res;
  }

}
