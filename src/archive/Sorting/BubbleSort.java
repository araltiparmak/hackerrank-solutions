package archive.Sorting;// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem

// @author Ali Rıza Altıparmak
// github.com/araltiparmak
// hackerrank.com/araltiparmak
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 4};
        countSwaps(a);
    }

    static void countSwaps(int[] arr) {
        int count = 0;
        boolean isSorted = false;
        int lastSorted = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastSorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    count++;
                    isSorted = false;
                    swap(arr, i, i + 1);
                }
            }
            lastSorted--;
        }
        System.out.format("Array is sorted in %d swaps.%n", count);
        System.out.format("First Element: %d%n", arr[0]);
        System.out.format("Last Element: %d", arr[arr.length - 1]);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
