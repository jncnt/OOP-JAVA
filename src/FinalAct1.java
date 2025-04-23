
import java.util.*;

public class FinalAct1 {

    public static double calculateIoC(String str1, String str2) {
        if (str1.length() != str2.length()) {
            throw new IllegalArgumentException("Strings must be of equal length.");
        }

        int matches = 0;
        int total = str1.length();

        for (int i = 0; i < total; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                matches++;
            }
        }

        return ((double) matches / total) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine().toLowerCase();

            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine().toLowerCase();

            try {
                double ioc = calculateIoC(str1, str2);
                System.out.printf("Index of Coincidence: %.2f%%%n", ioc);
                validInput = true; // Exit the loop if input is valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}