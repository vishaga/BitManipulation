package com.practice.bitmanipulation;

/**
 * Find right most set bit.
 *
 * <ul>
 * Example:
 *    1001100 (76) => Here right most set bit is at index 2.
 * <p>
 * Solution: flip binary and add 1 (or find 2's complement or -n)
 *    1001100 --> ~x -> 11111111111111111111111110110011 --> add 1 --> 11111111111111111111111110110100
 * <p>
 *    00000000000000000000000001001100 (76)
 *  & 11111111111111111111111110110100 (-76 or 2's complement of 76)
 * ------------------------------------
 *    00000000000000000000000000000100  (4)
 *
 * <p>
 * <ul/>
 */
public class RightMostSetBit {

  public static void main(String[] args) {
    int array[] = {76, 144, 39, 108, 248};
    for (int x : array) {
      System.out.println(Integer.toBinaryString(x) + " = " + (x & -x) + " , " + (x & (~x + 1)));
    }
  }

}
