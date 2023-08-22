package com.practice.bitmanipulation;

public class UpdateNthBit {

  public static void main(String[] args) {

    int x = 32; //100000
    for (int i = 0; i < 6; i++) {
      int mask = x | (1 << i);
      System.out.println(i + "th Bit is set: " + mask + ", Binary is: " + Integer.toBinaryString(mask));
    }
  }

}
