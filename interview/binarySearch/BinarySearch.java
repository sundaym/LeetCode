package binarySearch;

/**
 * 二分查找
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int a) {
        // 头部索引
        int low = 0;
        // 尾部索引
        int high = array.length - 1;
        // 中间位置索引
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == a) {
                return mid;
            } else if (a > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4, 5, 999};
        int a = 999;
        int i = binarySearch(testArr, a);
        if (i == -1) {
            System.out.println("数组中没有值为a的元素");
        } else {
            System.out.println("a在数组的第" + i + "处");
        }
    }
}
