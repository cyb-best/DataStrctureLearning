package com.atcyb.sort;

import java.util.Arrays;

/**
 * @author cyb
 * @create 2022-01-18 18:26
 * @description:冒泡排序，时间复杂度为：O(n^2)，相邻俩个数比较，每一轮可以确定最大的数
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 4, 8, 7, 8};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] ^= arr[b];
        arr[b] ^= arr[a];
        arr[a] ^= arr[b];
    }
}
