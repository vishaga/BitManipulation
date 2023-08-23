package com.practice.bitmanipulation;

/**
 * Set Nth bit (set mean making that bit 1).
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
 * | 010000
 * ----------------------
 *    0
 * ----------------------
 * <ul/>
 */
public class SetNthBit {

  public static void main(String[] args) {

    int x = 32; //100000

    for (int i = 0; i < 6; i++) {
      int mask = x | (1 << i);
      System.out.println(i + "th Bit is set: " + mask + ", Binary is: " + Integer.toBinaryString(mask));
    }
    System.out.println(Integer.toBinaryString(38 | (1 << 4)));
    System.out.println(Integer.toBinaryString(38 | (1 << 1)));
  }

}
