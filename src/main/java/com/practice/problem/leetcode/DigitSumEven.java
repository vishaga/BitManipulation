package com.practice.problem.leetcode;

/**
 * Question Link: https://leetcode.com/problems/count-integers-with-even-digit-sum/description/
 *
 * <p>
 * Given a positive integer num, return the number of positive integers less than or equal to num
 * whose digit sums are even. The digit sum of a positive integer is the sum of all its digits.
 * <p/>
 *
 * <ul>
 * Example 1:
 *    Input: num = 4
 *    Output: 2
 *    Explanation: The only integers less than or equal to 4 whose digit sums are even are 2 and 4.
 * <p>
 *  Example 2:
 *    Input: num = 30
 *    Output: 14
 *    Explanation: The 14 integers less than or equal to 30 whose digit sums are even are
 *    2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
 * <ul/>
 *
 * <p>
 *   Constraints: 1 <= num <= 1000
 * <p/>
 */

public class DigitSumEven {

  public static void main(String[] args) {
    int arr[] = {27, 34, 22, 13, 11, 17, 4, 30};
    for (int num : arr) {
      System.out.println(num + " : " + countEven(num));
    }
  }


  public static int countEven(int num) {
    int res = 0;
    while (num > 1) {
      if ((digitSum(num) & 1) == 0) {
        res++;
      }
      num--;
    }
    return res;
  }

  private static int digitSum(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
