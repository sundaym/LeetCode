package bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 1.冒泡排序有两层循环，时间复杂度O(n^2)，空间复杂度O(1)
 * 2.冒泡排序就是在无序的数组中找到一个最大(小)的数，将这个数放到有序数组中，这是内层循环
 * 3.因为给出的无序数组有n个数，所以需要进行n次寻找最大(小)数的过程，这是外层循环的含义
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] testArr = {2, 1, 6, 5, 0, 11, 7, 13, 44};
        System.out.println("排序前数组: " + Arrays.toString(testArr));
        int[] sortedArr = bubbleSort(testArr);
        System.out.println("排序后数组: " + Arrays.toString(sortedArr));
    }
}
