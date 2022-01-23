package com.atcyb.sort;

import java.util.Arrays;

/**
 * @author cyb
 * @create 2022-01-18 17:42
 * @desrciption : 选择排序，时间复杂度为 O(n^2), 每次排序选择最小的数放在最左边
 */
public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 8, 5}; //  1,2,3,5,6,8
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


