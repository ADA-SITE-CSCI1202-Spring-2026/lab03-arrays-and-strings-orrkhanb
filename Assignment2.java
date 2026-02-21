import java.util.Scanner;

public class Assignment2 {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++)
                arr[i] = Integer.parseInt(args[i]);

            System.out.println("Command line - Min: " + findMin(arr) + ", Max: " + findMax(arr));
            int[] both = findMinAndMax(arr);
            System.out.println("Both at once - Min: " + both[0] + ", Max: " + both[1]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("Scanner - Min: " + findMin(arr) + ", Max: " + findMax(arr));
        int[] both = findMinAndMax(arr);
        System.out.println("Both at once - Min: " + both[0] + ", Max: " + both[1]);

        scanner.close();
    }
}
