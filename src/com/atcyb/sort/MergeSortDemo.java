package com.atcyb.sort;

import java.util.Arrays;

/**
 * @author cyb
 * @create 2022-01-19 19:24
 * @description: MergeSort 归并排序 时间复杂度：O(NlogN) 空间复杂度O(n)
 *
 */
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 1, 3, 5};
        process(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void process(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1); //midNumber
        process(arr, l, mid);
        process(arr, mid + 1, r);
        mergeSort(arr, l, mid, r);
    }

    public static void mergeSort(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int index = 0; //for help
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r) {
            help[index++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            help[index++] = arr[p1++];
        }

        while (p2 <= r) {
            help[index++] = arr[p2++];
        }

        for (int i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }
}
