package com.practice.problem;

public class MakeItBinary {

  public static void main(String[] args) {
    int array[] = {2, 4, 7, 9, 18, 15, 32, 31, 86, 128};

    for (int num : array) {
      int sum = 0;
      int i = num;
      int power = 1;
      while (i > 0) {
        int lastBit = i & 1;
        sum += power * lastBit;
        power *= 10;
        i = i >> 1;
      }
      System.out.println(num + " -> " + sum + ", " + Integer.toBinaryString(num));
    }
  }

}
