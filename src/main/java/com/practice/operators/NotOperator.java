package com.practice.operators;

/**
 * <p>
 * BitWise NOT Operator (~ or Tilde) flips the bits including the most significant bit (MSB) which
 * is sign bit.
 * <p/>
 *
 * <ul>
 * Example 1:
 * //     X = 0; //00000000000000000000000000000000
 * //    ~X= -1; //11111111111111111111111111111111
 * //----------------------------------------------
 * //
 * <ul/>
 * <p>
 * for 11111111111111111111111111111111 the first bit is sign bit and to get the magnitude
 * of remaining bits is to find 2's complement. To get the magnitude, again flip the bits and add 1 bit;
 * 10000000000000000000000000000000
 *                              + 1
 * ----------------------------------------------
 * 10000000000000000000000000000001 (which is -1)
 * <p/>
 */
public class NotOperator {

  public static void main(String[] args) {
    int x = 0;// 00000000000000000000000000000000

    System.out.println(~x);
    System.out.println(Integer.toBinaryString(~x));
  }
}
