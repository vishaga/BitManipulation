package com.practice.bitmanipulation;

/**
 * Get Nth bit be it set or unset.
 *
 * <ul>
 *   1 << n will shift 1 to leftwards.
 *   1 << 5 = 10000
 *   ===================
 *   num & (1 << i) where n = 38, i = 4
 *   -------------------
 *   n = 100110, 1 << 4 = 10000
 *   -------------------
 *   100110
 * & 010000
 * ----------------------
 *    0
 * ----------------------
 * <ul/>
 */
public class GetNthBit {

  public static void main(String[] args) {

    int x = 18; //10010

    for (int i = 0; i < 5; i++) {
      int mask = x & (1 << i);
      System.out.println("ith " + i + " Bit is: " + (mask > 0 ? 1 : 0));
    }
    System.out.println(Integer.toBinaryString(38 & (1 << 4)));
    System.out.println(Integer.toBinaryString(38 & (1 << 2)));
  }


}
