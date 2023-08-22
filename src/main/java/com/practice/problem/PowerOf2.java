package com.practice.problem;

public class PowerOf2 {

  public static void main(String[] args) {
    int array[] = {4, 7, 9, 18, 32, 86, 128};

    for(int num: array){
      int mask = num & (num-1);
      System.out.println(num + " is" + ((mask ==0) ? "":" Not") + " power of 2");
    }
  }

}
