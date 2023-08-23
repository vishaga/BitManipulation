package com.practice.bitmanipulation;

/**
 * Update Nth bit (update 0/1).
 *
 * <ul>
 *   Example:
 *    n = 100110 (38)
 * -----------------------
 *  set 3rd bit to 1 => 101110
 * -----------------------
 *  set 5th bit to 0 => 000110
 * -----------------------
 * <p>
 * <ul/>
 */
public class UpdateNthBit {

  public static void main(String[] args) {

    int x = 32; //100000
    for (int i = 0; i < 6; i++) {
      int mask = x | (1 << i);
      System.out.println(i + "th Bit is set: " + mask + ", Binary is: " + Integer.toBinaryString(mask));
    }
    //set bit to 0
    System.out.println((38 & ~(1 << 5)));
    System.out.println((38 | (1 << 0)));
  }

}
