import java.util.Scanner;

public class InsertionSortLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read size
        int size = sc.nextInt();
        int[] arr = new int[size];

        // read elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Output original array
        printArray(arr);

        int comparisons = 0;
        int swaps = 0;

        // Insertion sort
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++; // count comparison

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    swaps++; // count swap-like shift
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;

            // Print array after each outer loop iteration
            printArray(arr);
        }

        System.out.println();
        System.out.println("comparisons: " + comparisons);
        System.out.println("swaps: " + swaps);
    }

    // Print array in one line
    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
