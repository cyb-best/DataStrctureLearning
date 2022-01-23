package com.atcyb.sort;

import java.util.Arrays;

/**
 * @author cyb
 * @create 2022-01-18 19:09
 */
public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2, 5, 8, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] ^= arr[b];
        arr[b] ^= arr[a];
        arr[a] ^= arr[b];
    }
}
