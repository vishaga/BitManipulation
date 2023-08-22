package com.practice.bitmanipulation;

public class ClearNthBit {

  public static void main(String[] args) {

    int x = 31; //11111

    for (int i = 0; i < 5; i++) {
      int mask = x & ~(1 << i);
      System.out.println(i + "th Bit is cleared: " + mask + ", Binary is: " + Integer.toBinaryString(mask));
    }
  }
}
