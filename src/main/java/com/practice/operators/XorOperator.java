package com.practice.operators;

/**
 * <p>
 * BitWise XOR (^) works on bits and if for value1 and value2, for odd number of set bit (i.e if
 * only one of the bits out of 2 values are set) than it will be 1 other wise 0;
 * <p/>
 *
 * <ul>
 * Example 1:
 * //       1 0 1 (5 Binary)
 * //    ^  1 1 1 (7 Binary)
 * //------------------------
 * //       0 1 0 (2 Binary)
 * <p>
 * Example 2:
 *  * //       1 0 1 (5 Binary)
 *  * //    ^  0 0 1 (1 Binary)
 *  * //------------------------
 *  * //       1 0 0 (4 Binary)
 * <ul/>
 */
public class XorOperator {

  public static void main(String[] args) {
    int x = 5;// 101
    int y = 7;// 111

    System.out.println(x ^ y); //2

    x = 5;// 101
    y = 1;// 001

    System.out.println(x ^ y); //4
  }

}