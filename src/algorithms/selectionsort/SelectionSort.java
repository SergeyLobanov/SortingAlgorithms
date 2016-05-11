package algorithms.selectionsort;

/**
 * Created by Сергей on 10.05.2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 3, 1, 9, 6, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
}
