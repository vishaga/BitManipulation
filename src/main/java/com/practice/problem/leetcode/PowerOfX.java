package com.practice.problem.leetcode;

/**
 * Question Link: https://leetcode.com/problems/powx-n/description/
 *
 * <p>
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * <p/>
 *
 * <ul>
 * <p>
 *   Example 1:
 *      Input: x = 2.00000, n = 10
 *      Output: 1024.00000
 * <p>
 *   Example 2:
 *      Input: x = 2.10000, n = 3
 *      Output: 9.26100
 * <p>
 *   Example 3:
 *      Input: x = 2.00000, n = -2
 *      Output: 0.25000
 *      Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * <ul/>
 *
 * <ul>
 *    Constraints:
 *        -100.0 < x < 100.0
 *        -231 <= n <= 231-1
 *        n is an integer.
 *        Either x is not zero or n > 0.
 *        -104 <= xn <= 104
 * <ul/>
 */
public class PowerOfX {

  public static void main(String[] args) {
    int array[] = {4, -2, 2, 10, 2, 3, 2, 0, 2, -2, 2, -2147483648};
    for (int i = 0; i < array.length; i += 2) {
      System.out.println(array[i] + "^" + array[i + 1] + " = " + myPow(array[i], array[i + 1]));
    }
  }

  public static double myPow(double x, int n) {
    double res = 1; //Multiplicative identity
    //Sign is need as it can be +/- and based on that * or / will take place.
    // As 2^4 = 16 but 2^-4 = 0.0625
    boolean sign = n >= 0;
    //while should be != 0, > 0 won't work with the same reason being n can be < 0.
    while (n != 0) {
      if ((n & 1) == 1) {
        //Based on sign multiplication or division will take place.
        if (sign) {
          res *= x;
        } else {
          res /= x;
        }
      }
      x *= x;
      /**
       *>> (right shift won't help here as for negative numbers the left most set
       * bit wil always be added as 1 and it will run indefinitely)
       * >>> (unsigned right shift) wil be always add 0 bit
       *
       */
      n >>>= 1;
    }
    return res;
  }

}
