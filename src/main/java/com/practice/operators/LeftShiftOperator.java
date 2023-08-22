package com.practice.operators;

/**
 * <p>
 * BitWise Left Shift Operator (<<) shifts the bits left wards. For a given binary values, with left
 * shift (<<) will shift the bits towards left. Shifting 1 bit towards left also means multiplying
 * by 2;
 * <p/>
 *
 * <ul>
 * Example 1:
 * //     x = 5, i = 2;
 * //     5<<2
 * //     101 << 2
 * //--------------
 * //   10100 (two 0 bits added in the right or as a result the existing bit shifted towards left)
 * //   Above number is nothing but 20 (which is 5 * 2 ^ i where i=2);
 * //
 * <ul/>
 */
public class LeftShiftOperator {

  public static void main(String[] args) {
    int x = 5;// 101
    int i = 3;

    System.out.println(x << i); //5 * (2 pow 3) = 40

    x = 7;// 111
    i = 4;//

    System.out.println(x << i); //7 * (2 pow 4) = 112
  }
}
