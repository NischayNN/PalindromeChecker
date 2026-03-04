import java.util.Scanner;
import java.util.Stack;

public class thirteenth {

    // Method 1: Reverse String
    public static boolean reverseCheck(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 3: Stack Method
    public static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse Method
        long start1 = System.nanoTime();
        boolean r1 = reverseCheck(input);
        long end1 = System.nanoTime();

        // Two Pointer Method
        long start2 = System.nanoTime();
        boolean r2 = twoPointerCheck(input);
        long end2 = System.nanoTime();

        // Stack Method
        long start3 = System.nanoTime();
        boolean r3 = stackCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nPerformance Comparison:");

        System.out.println("Reverse Method: " + r1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method: " + r2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Stack Method: " + r3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}