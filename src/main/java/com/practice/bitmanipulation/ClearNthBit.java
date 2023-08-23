package com.practice.bitmanipulation;

/**
 * Clear Nth bit (clear mean making that bit 0).
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
public class ClearNthBit {

  public static void main(String[] args) {

    int x = 31; //11111

    for (int i = 0; i < 5; i++) {
      int mask = x & ~(1 << i);
      System.out.println(i + "th Bit is cleared: " + mask + ", Binary is: " + Integer.toBinaryString(mask));
    }
    System.out.println(Integer.toBinaryString(38 & ~(1 << 5)));
    System.out.println(Integer.toBinaryString(38 & ~(1 << 2)));
  }
}
