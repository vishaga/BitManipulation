package com.practice.operators;

/**
 * <p>
 * BitWise AND (&) works on bits and if for value1 and value2, if both the bits are set (or 1) than
 * it will be 1 other wise 0;
 * <p/>
 *
 * <ul>
 * Example:
 * //       1 0 1 (5 Binary)
 * //    &  1 1 1 (7 Binary)
 * //------------------------
 * //       1 0 1 (5 Binary)
 * <ul/>
 */
public class AndOperator {

  public static void main(String[] args) {
    int x = 5;// 101
    int y = 7;// 111

    System.out.println(x & y); //5
  }

}