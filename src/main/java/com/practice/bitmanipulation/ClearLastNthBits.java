package com.practice.bitmanipulation;

public class ClearLastNthBits {

  public static void main(String[] args) {

    int x = 234; //11101010
    int n = -1; //11111111111111111111111111111111
    for (int i = 0; i < 8; i++) {
      int mask = x & (n << i + 1);
      System.out.println("Last " + i + "th Bit is cleared: " + mask + ", Binary is: " + Integer
          .toBinaryString(mask));
    }
  }

}
