//array basics 
import java.util.*;

public class ArrayBasicsComplete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = 0, max = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1)
            System.out.println("Element found at index " + foundIndex);
        else
            System.out.println("Element not found");

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position (0-based): ");
        int pos = sc.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        n++;

        System.out.print("After insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Enter position to delete: ");
        int delPos = sc.nextInt();

        for (int i = delPos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        System.out.print("After deletion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        Arrays.sort(arr, 0, n);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Enter element for binary search: ");
        int bsKey = sc.nextInt();
        int index = Arrays.binarySearch(arr, 0, n, bsKey);

        if (index >= 0)
            System.out.println("Binary search found at index " + index);
        else
            System.out.println("Binary search element not found");

        System.out.println("Enter 2x2 matrix elements:");
        int[][] matrix = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
