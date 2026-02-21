import java.util.Scanner;

/**
 * Assignment 2 - Greatest and Smallest Elements
 */
public class Assignment2 {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // Part (i): from command line arguments
        if (args.length > 0) {
            int[] cmdArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("=== Command Line Array ===");
            System.out.print("Array: ");
            printArray(cmdArray);
            System.out.println("Min: " + findMin(cmdArray));
            System.out.println("Max: " + findMax(cmdArray));

            int[] both = findMinAndMax(cmdArray);
            System.out.println("Min and Max together: [" + both[0] + ", " + both[1] + "]");
            System.out.println();
        }

        // Part (ii): from Scanner input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] scanArray = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            scanArray[i] = scanner.nextInt();
        }

        System.out.println("\n=== Scanner Array ===");
        System.out.print("Array: ");
        printArray(scanArray);
        System.out.println("Min: " + findMin(scanArray));
        System.out.println("Max: " + findMax(scanArray));

        int[] both = findMinAndMax(scanArray);
        System.out.println("Min and Max together: [" + both[0] + ", " + both[1] + "]");

        scanner.close();
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
