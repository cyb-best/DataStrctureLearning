package com.atcyb.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author cyb
 * @create 2022-01-23 18:31
 * @description:时间复杂度为：O(NlogN) 空间复杂度为: O(logN), 不稳定
 */
public class QuickSortDemo {
   @Test
    public void test() {
    int[] arr = {4, 7, 6, 5, 3, 2, 8, 1};
    quickSort(arr, 0, arr.length - 1);
       System.out.println(Arrays.toString(arr));
   }

   //point change method
   public void quickSort(int[] arr, int startIndex, int endIndex) {
            if (arr == null || arr.length < 2 || startIndex >= endIndex) {
                return;
            }
            //traversal
            int pivotIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIndex);

   }

   //To search the pivot
   public int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while(left != right) {
            while(right > left && arr[right] > pivot) {
                right--;
            }

            while (left < right && arr[left] <= pivot) {
                left++;
            }

            if (left < right) {
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }
        }

        int p = arr[left];
        arr[left] = arr[startIndex];
        arr[startIndex] = p;
        return left;
   }

}
