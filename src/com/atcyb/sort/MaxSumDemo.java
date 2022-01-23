package com.atcyb.sort;

/**
 * @author cyb
 * @create 2022-01-19 18:51
 * @description:递归求一个数组在某个范围内的最大值
 */
public class MaxSumDemo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 7, 4};
        int res = process(arr, 0, arr.length - 1);
        System.out.println(res);
    }

    public static int process(int[] arr, int a, int b) {
        if (a == b) {
            return arr[a];
        }
        int midNum = a + ((b - a) >> 1);//通过位运算实现求中位数
        int res1 = process(arr, a, midNum);
        int res2 = process(arr, midNum + 1, b);
        return Math.max(res1, res2);
    }

}
