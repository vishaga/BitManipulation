package com.practice.problem.leetcode;

/**
 * Question Link: https://leetcode.com/problems/add-binary/description/
 *
 * <p>
 * Given two binary strings a and b, return their sum as a binary string.
 * <p/>
 *
 * <ul>
 * Example 1:
 *  Input: a = "11", b = "1"
 *  Output: "100"
 * <p>
 * Example 2:
 *  Input: a = "1010", b = "1011"
 *  Output: "10101"
 * <ul/>
 *
 * <ul>
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 * <ul/>
 */

public class AddBinary {

  public String addBinary(String a, String b) {
    int len1 = a.length() - 1;
    int len2 = b.length() - 1;
    int carry = 0;
    StringBuilder sb = new StringBuilder();

    while (len1 >= 0 || len2 >= 0) {
      if (len1 >= 0) carry += a.charAt(len1--) - '0';
      if (len2 >= 0)carry += b.charAt(len2--) - '0';
      sb.append(carry % 2);
      carry /= 2;
    }

    if(carry > 0){
      sb.append(carry);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String result = new AddBinary().addBinary("100", "101");
    System.out.println(result);
  }
}
