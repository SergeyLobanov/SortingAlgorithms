package algorithms.insertionsort;

/**
 * Created by Сергей on 10.05.2016.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 3, 1, 9, 6, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
