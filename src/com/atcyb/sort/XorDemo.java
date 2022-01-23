package com.atcyb.sort;

/**
 * @author cyb
 * @create 2022-01-18 18:42
 * @description:异或：可以用于俩个数之间的交换，详见BubbleSortDemo中的swap()。 相关题目：给定一个整形数组，（1）数组中有一个数出现的次数是奇数个，其他的数都是偶数个，求出次数为奇数个的那个数
 * （2）有俩个数出现的次数为奇数个，其他数都是偶数个，求出次数为奇数个的那俩个数
 */
public class XorDemo {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 3, 2, 3, 2, 2, 1};
        int[] test2 = {1, 2, 3, 3, 2, 3, 2, 2};
        int res = xor1(test1);
        System.out.println(res);
        xor2(test2);
    }

    public static int xor1(int[] arr) {
        int ero = 0;
        for (int a : arr) {
            ero ^= a;
        }
        return ero;
    }

    public static void xor2(int[] arr) {
        int ero = 0;
        for (int a : arr) {
            ero ^= a; //ero = a^b
        }

        int right = ero & (~ero + 1); //可以得到ero最右的1

        int result = 0;
        for (int cur : arr) {
            if ((cur & right) == 0) {
                result ^= cur;
            }
        }
        System.out.println("the first num is:" + result + "  the second num is:" + (ero ^ result));
    }
}
