package algorithms.heapsort;

import java.util.Arrays;

/**
 * Created by Сергей on 10.05.2016.
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 3, 1, 9, 6, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        heapSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        Arrays.sort(array);
    }

    public static void heapSort(int a[]) {
        int n = a.length;

        for (int k = n / 2; k > 0; k--) {
            downheap(a, k, n);
        }

        do {
            int T = a[0];
            a[0] = a[n - 1];
            a[n - 1] = T;
            downheap(a, 1, --n);

        } while (n > 1);

    }

    public static void downheap(int a[], int k, int n) {
        int t = a[k - 1];

        while (k <= n / 2) {
            int j = k + k;

            if ((j < n) && (a[j - 1] < a[j])){
                j++;
            }
            if (t >= a[j - 1]) {
                break;
            } else {
                a[k - 1] = a[j - 1];
                k = j;
            }
        }

        a[k - 1] = t;
    }
}
