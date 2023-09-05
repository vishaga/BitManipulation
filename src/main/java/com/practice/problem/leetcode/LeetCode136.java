package com.practice.problem.leetcode;


import java.util.HashSet;
import java.util.Set;

/**
 * Question Link: https://leetcode.com/problems/single-number/description/
 *
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that
 * single one. You must implement a solution with a linear runtime complexity and use only constant
 * extra space.
 * <p/>
 *
 * <ul>
 * Example 1
 *  Input: nums = [2,2,1]
 *  Output: 1
 * <p>
 * Example 2
 *  Input: nums = [4,1,2,1,2]
 *  Output: 4
 * <ul/>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */

public class LeetCode136 {

  public static void main(String[] args) {
    int array[][] = {{2, 2, 1}, {4, 1, 2, 1, 2}, {1}, {7, 7, 3}};
    for (int arr[] : array) {
      System.out.println(singleNumber(arr) + ", " + singleNumber_(arr));
    }
  }

  //Efficient Approach using XOR operation
  public static int singleNumber(int[] nums) {
    int result = 0;
    for (int x : nums) {
      result ^= x;
    }
    return result;
  }

  //Intuitive approach using hashSet or HashMap also can be used.
  public static int singleNumber_(int[] nums) {
    Set<Integer> seen = new HashSet<Integer>();
    for (int x : nums) {
      //Since every element occurs twice (except one) so whenever element comes for the 2nd time than remove it from set.
      if (seen.contains(x)) {
        seen.remove(x);
      } else {
        seen.add(x);
      }
    }
    return seen.iterator().next();
  }
}
