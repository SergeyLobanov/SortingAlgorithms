package algorithms.mergesort;

/**
 * Created by Сергей on 10.05.2016.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 3, 1, 9, 6, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p+r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);
        }

        return array;
    }
    public static int[] merge(int[] array, int p, int q, int r){
        int[] left = new int[q-p+2];
        int[] right = new int[r-q+1];

        System.arraycopy(array, p, left, 0, left.length-1);
        System.arraycopy(array, q+1, right, 0, right.length-1);

        left[left.length - 1] = Integer.MAX_VALUE;
        right[right.length - 1] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = p; k < r+1; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i++];
            }
            else {
                array[k] = right[j++];
            }
        }
        return array;
    }
}
