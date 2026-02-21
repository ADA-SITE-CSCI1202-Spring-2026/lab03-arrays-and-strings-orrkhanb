import java.util.Scanner;

public class Assignment7 {

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String result = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);

        scanner.close();
    }
}
