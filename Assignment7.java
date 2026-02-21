import java.util.Scanner;

/**
 * Assignment 7 - String Reversed
 */
public class Assignment7 {

    public static String reverse(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(chars);
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
