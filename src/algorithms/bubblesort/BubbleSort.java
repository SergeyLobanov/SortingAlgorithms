package algorithms.bubblesort;

/**
 * Created by Сергей on 10.05.2016.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 3, 1, 9, 6, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


}
