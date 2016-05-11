package algorithms.quicksort;

/**
 * Created by Сергей on 10.05.2016.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 3, 1, 9, 6, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            sort(arr, p, q - 1);
            sort(arr, q + 1, r);
        }

    }

    public static int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }
}
