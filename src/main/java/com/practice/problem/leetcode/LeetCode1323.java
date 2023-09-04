package com.practice.problem.leetcode;

/**
 * Question Link: https://leetcode.com/problems/maximum-69-number/description/
 *
 * <p>
 * You are given a positive integer num consisting only of digits 6 and 9.
 * <p>
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes
 * 6).
 * <p/>
 *
 * <ul>
 * Example 1
 *  Input: num = 9669
 *  Output: 9969
 *  Explanation:
 *    Changing the first digit results in 6669.
 *    Changing the second digit results in 9969.
 *    Changing the third digit results in 9699.
 *    Changing the fourth digit results in 9666.
 *    The maximum number is 9969.
 * <p>
 * Example 2
 *  Input: num = 9996
 *  Output: 9999
 *  Explanation:
 *  Changing the last digit 6 to 9 results in the maximum number.
 * <ul/>
 */

public class LeetCode1323 {

  public static void main(String[] args) {
    int array[] = {9999, 9996, 9669, 6666};
    for (int x : array) {
      int v1 = maximum69Number_1(x);
      int v2 = maximum69Number_2(x);
      int v3 = maximum69Number_3(x);
      System.out.println("for value: " + x + " -> " + v1 + ", " + v2 + ", " + v3);
    }
  }

  //Approach: 3 , Better
  public static int maximum69Number_3(int num) {
    int copyNum = num;
    int mul = 1;
    int factor = 0;
    while (copyNum > 0) {
      if (copyNum % 10 == 6) {
        factor = mul;
      }
      mul *= 10;
      copyNum /= 10;
    }
    return factor == 0 ? num : num + factor * 3;
  }

  //Approach: 2 , Intuitive
  public static int maximum69Number_2(int num) {
    String str = "" + num;
    str = str.replaceFirst("6", "9");
    return Integer.parseInt(str);
  }

  //Approach: 1 , Intuitive
  public static int maximum69Number_1(int num) {
    StringBuilder sb = new StringBuilder();
    sb.append(num);
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == '6') {
        sb.setCharAt(i, '9');
        break;
      }
    }
    return Integer.parseInt(sb.toString());
  }
}
