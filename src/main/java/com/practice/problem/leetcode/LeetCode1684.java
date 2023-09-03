package com.practice.problem.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Question Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 *
 * <p>
 * You are given a string allowed consisting of distinct characters and an array of strings words. A
 * string is consistent if all characters in the string appear in the string allowed.
 * <p>
 * Return the number of consistent strings in the array words.
 * <p/>
 *
 * <ul>
 * Example 1
 *  Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 *  Output: 2
 *  Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 * <p>
 * Example 2
 *  Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 *  Output: 2
 *  Explanation: All strings are consistent.
 * <ul/>
 */

public class LeetCode1684 {

  public static void main(String[] args) {
    Map<String, String[]> input = new HashMap<String, String[]>();
    input.put("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"});
    input.put("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"});
    input.put("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"});
    for (Entry<String, String[]> e : input.entrySet()) {
      int v1 = countConsistentStrings_1(e.getKey(), e.getValue());
      int v2 = countConsistentStrings_2(e.getKey(), e.getValue());
      System.out.println("Method 1 result: " + v1 + ", Method 2 result: " + v2);
    }
  }

  //Optimal O(1) space complexity using Bit Manipulation
  public static int countConsistentStrings_2(String allowed, String[] words) {
    int count = words.length;
    int bitSet = 0;
    for (char c : allowed.toCharArray()) {
      //set the bit for 1-26 location
      bitSet |= 1 << c - 'a';
    }
    for (String word : words) {
      for (char c : word.toCharArray()) {
        // set the bit for given position of alphabet
        int mask = 1 << c - 'a';
        // It will be 0 is it is not present in allowed list.
        if ((mask & bitSet) == 0) {
          count--;
          break;
        }
      }
    }
    return count;
  }

  //Intuitive way, O(n) Space complexity
  public static int countConsistentStrings_1(String allowed, String[] words) {
    Set<Character> valid = new HashSet<Character>();
    for (char c : allowed.toCharArray()) {
      valid.add(c);
    }

    int count = words.length;
    for (String word : words) {
      for (char c : word.toCharArray()) {
        if (!valid.contains(c)) {
          count--;
          break;
        }
      }
    }
    return count;
  }
}
