package quickSort;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        // 选择最后一个元素作为pivot
        int pivot = arr[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                int tmp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = tmp;
                pointer++;
            }
            System.out.println(Arrays.toString(arr));
        }
        // 中心元素和指针指向的元素交换位置
        int tmp = arr[pointer];
        arr[pointer] = arr[high];
        arr[high] = tmp;
        return pointer;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int position = partition(arr, low, high);
            // 左子数组递归调用
            quickSort(arr, low, position - 1);
            // 右子数组递归调用
            quickSort(arr, position + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {111, 23, 25, 1, 99, 0, 6, 88};
        System.out.println("排序前:" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:" + Arrays.toString(arr));
    }
}
