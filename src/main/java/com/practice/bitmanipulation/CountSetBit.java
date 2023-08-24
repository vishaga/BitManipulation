package com.practice.bitmanipulation;

/**
 * Count number of set bits.
 * 
 */
public class CountSetBit {

  public static void main(String[] args) {

    int x = 234; //11101010
    System.out.println(countSetBit_1(x));
    System.out.println(countSetBit_2(x));

    System.out.println(countSetBit_1(235));
    System.out.println(countSetBit_2(235));
  }

  /**
   * n & 1 will return 1 only when last bit is set and after each bit validation that can be dropped
   * by doing a right shift by 1 bit (n >> 1).
   *
   * <p>
   * Time complexity is 32 (worst case) if all bits or only the left significant bit is set.
   * <p/>
   *
   * @param n
   * @return
   */
  private static int countSetBit_1(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        count++;
      }
      n >>= 1;
    }
    return count;
  }


  /**
   * n & (n - 1) will remove the last set bit.
   *
   * <p>
   * Time complexity is log(n) or count of set bit.
   * <p/>
   *
   * @param n
   * @return
   */
  private static int countSetBit_2(int n) {
    int count = 0;
    while (n > 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }

}
