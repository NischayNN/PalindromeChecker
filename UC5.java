import java.util.Scanner;

public class UC5 {

    public static boolean isPalindrome(String input) {

        // Convert String to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
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

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }

        sc.close();
    }
}