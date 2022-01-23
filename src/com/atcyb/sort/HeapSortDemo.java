package com.atcyb.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author cyb
 * @create 2022-01-20 18:52
 * @description: 堆排序，时间复杂度为O(NlogN) 空间复杂度为：O(1)
 */
public class HeapSortDemo {


    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4, 3, 8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort (int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
//        for (int i = 0; i < arr.length; i++) {
//            heapInsert(arr,i);
//        }
        for (int i = arr.length - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }


    //往上寻找大根堆
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap (arr,index,(index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //某个数在index位置上能否往下移动
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        int largest = 0;
        while(left < heapSize) {
            largest = left + 1 < heapSize && arr[left+1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, index, largest);
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
