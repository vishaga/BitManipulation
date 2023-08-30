package com.practice.bitmanipulation;

import java.util.Arrays;

/**
 * Given 2 or n numbers, check if the result of division or multiplication result woul dbe positive
 * or negative
 */
public class SignCheck {

  public static void main(String[] args) {
    int arrays[][] = {{1, 2}, {-9, 3}, {9, -3}, {-8, -2}, {-9, 2, -3}};
    for (int array[] : arrays) {
      printMultiplicationResultSign_1(array);
      printMultiplicationResultSign_2(array);
      System.out.println("-------------------------");
    }
  }

  /**
   * This is approach 1 where we simply multiply -1 in case of negative nums;
   *
   * @param array
   */
  private static void printMultiplicationResultSign_1(int array[]) {
    System.out.print(Arrays.toString(array));
    int result = 1;
    for (int x : array) {
      if (x < 0) {
        result *= -1;
      }
    }
    System.out.println(" , result sign = " + result);
  }

  /**
   * This is approach 2 where we simply use XOR to determine sign;
   *
   * @param array
   */
  private static void printMultiplicationResultSign_2(int array[]) {
    System.out.print(Arrays.toString(array));
    int result = 0;
    for (int x : array) {
      result = (result < 0) ^ (x < 0) ? -1 : 1;
    }
    System.out.println(" , result sign = " + result);
  }
}
