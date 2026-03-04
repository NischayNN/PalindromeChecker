import java.util.Scanner;

public class U10 {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(normalized)) {
            System.out.println("It is a Palindrome (Ignoring case and spaces).");
        } else {
            System.out.println("Not a Palindrome.");
        }

        sc.close();
    }
}