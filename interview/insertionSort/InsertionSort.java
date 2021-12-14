package insertionSort;

import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度O(n^2)
 */
public class InsertionSort {
    public static int[] insertSort(int[] arr) {
        // 第一个数就算做已排序好的序列，所以插入的数从第二个开始
        for (int i = 1; i < arr.length; i++) {
            // 插入的数
            int insertValue = arr[i];
            // 被插入的位置
            int index = i - 1;
            // 如果插入的数比被插入位置的数小
            while (index >= 0 && insertValue < arr[index]) {
                // 将已排序的序列中的数向后移动
                arr[index + 1] = arr[index];
                index--;
            }
            // 将插入的数放到已排序队列中合适的位置
            arr[index + 1] = insertValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {88, 63, 99, 0, 1, 55, 31};
        System.out.println("数组:" + Arrays.toString(arr));
        int[] sortedArr = insertSort(arr);
        System.out.println("排序后:" + Arrays.toString(sortedArr));
    }
}
