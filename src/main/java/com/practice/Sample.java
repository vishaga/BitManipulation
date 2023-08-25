package com.practice;

public class Sample {

  public static void main(String[] args) {
    System.out.println(Integer.toBinaryString(18));
    System.out.println(Integer.toBinaryString(-18));

    byte aByte = (byte) -111;   // -2 (signed) and 254 (unsigned)
    System.out.println("Input : " + aByte);

    // byte to an unsigned integer
    // & 0xff to prevent sign extension, no effect on positive
    int result = aByte & 0xff;

    System.out.println(result);  // 254
    System.out.println(Integer.toBinaryString(result)); // 1111 1110

    String resultWithPadZero = String.format("%32s", Integer.toBinaryString(result))
        .replace(" ", "0");

    System.out.println(resultWithPadZero);

    System.out.println(" ====> " + Integer.toBinaryString(-1));
    System.out.println(" ====> " + Integer.toBinaryString(-1 >> 10));
    System.out.println(" ====> " + Integer.toBinaryString(-1 >>> 29));


    System.out.println(" ====> " + Integer.toBinaryString(76));
    System.out.println(" ====> " + Integer.toBinaryString(-76));


  }

}
// 11111111111111111111111111101110
// 00000000000000000000000000010010