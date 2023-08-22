package com.practice.bitmanipulation;

public class GetNthBit {

  public static void main(String[] args) {

    int x = 18; //10010

    for (int i = 0; i < 5; i++) {
      int mask = x & (1 << i);
      System.out.println("ith " + i + " Bit is: " + (mask > 0 ? 1 : 0));
    }
  }


}
