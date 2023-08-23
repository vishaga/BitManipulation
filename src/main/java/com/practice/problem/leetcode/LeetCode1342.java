package com.practice.problem.leetcode;

/**
 * Question Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 *
 * <p>
 * Given an integer num, return the number of steps to reduce it to zero. In one step, if the
 * current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <p/>
 *
 * <ul>
 * Example 1:
 * <p>
 *  Input: num = 14
 *  Output: 6
 *  Explanation:
 *  Step 1) 14 is even; divide by 2 and obtain 7.
 *  Step 2) 7 is odd; subtract 1 and obtain 6.
 *  Step 3) 6 is even; divide by 2 and obtain 3.
 *  Step 4) 3 is odd; subtract 1 and obtain 2.
 *  Step 5) 2 is even; divide by 2 and obtain 1.
 *  Step 6) 1 is odd; subtract 1 and obtain 0.
 * <ul/>
 */

public class LeetCode1342 {

  public int numberOfSteps(int num) {
    int stepCount = 0; // Identity value;
    int temp = num; // num should not be modified (as a good practice)
    while (temp > 0) {
      temp = ((temp & 1) == 0) ? temp >> 1 : temp - 1;
      stepCount++;
    }
    return stepCount;
  }

  public static void main(String[] args) {
    System.out.println(new LeetCode1342().numberOfSteps(14));
  }

}
