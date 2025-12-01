import java.util.Scanner;

public class MergeSortLab {
    static int comparisons = 0;
    static int swaps = 0; // counts placements into the temp array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read size
        int size = sc.nextInt();
        int[] arr = new int[size];

        // read elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print unsorted
        System.out.print("unsorted: ");
        printArray(arr);

        // Perform merge sort
        mergeSort(arr, 0, size - 1);

        System.out.println();
        System.out.print("sorted:   ");
        printArray(arr);

        System.out.println("comparisons: " + comparisons);
        // If swaps required -> System.out.println("swaps: " + swaps);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            comparisons++; // every comparison of L[i] and R[j]

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            swaps++; // every placement into arr counts as swap-like op
            k++;
        }

        // Copy rest of L (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            swaps++;
        }

        // Copy rest of R (if any)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            swaps++;
        }
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
