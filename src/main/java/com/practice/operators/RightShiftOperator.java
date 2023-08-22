package com.practice.operators;

/**
 * <p>
 * BitWise Right Shift Operator (>>) shifts the bits right wards (or drops the bits). For a given
 * binary values, with right shift (>>) will remove (drops) the bits towards right. Dropping last
 * bit also means dividing by 2;
 * <p/>
 *
 * <ul>
 * Example 1:
 * //     x = 16, i = 3;
 * //     16>>3
 * //     10000 >> 3
 * //--------------
 * //   00010 (last 3 bits will be dropped)
 * //   Above number is nothing but 4 (which is 16 / 2 ^ i where i=3);
 * //
 * <ul/>
 */
public class RightShiftOperator {

  public static void main(String[] args) {
    int x = 16;// 10000
    int i = 3;

    System.out.println(x >> i); //16 / (2 pow 3) = 2

    x = 48;// 110000
    i = 4;//

    System.out.println(x >> i); //48 / (2 pow 4) = 3
  }
}
