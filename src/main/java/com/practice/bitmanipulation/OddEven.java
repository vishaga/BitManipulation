package com.practice.bitmanipulation;

/**
 * <p>
 * Find Odd/Even number using bitwise operator. For any given odd number, the last bit always be set
 * and we will use this fact to identify even/odd.
 * <p/>
 *
 * <ul>
 * Example:
 * //     0 1 0 1 (5 is odd)
 * //     1 1 1 1 (15 is odd)
 * //     0 1 1 1 (7 is odd)
 * ------------------------
 * //     0 1 0 0 (4 is even)
 * //     1 1 1 0 (14 is even)
 * <ul/>
 *
 * <p>
 *   If we perform & of 1 with any number, the result will be 1 if and only if number is odd else 0;
 *   Special case for 0 and 1;
 * <p>
 */
public class OddEven {

  public static void main(String[] args) {

    for (int i = 2; i < 11; i++) {
      String msg = (i & 1) == 0 ? "Even" : "Odd";
      System.out.println(i + " is " + msg);
    }
  }
}
