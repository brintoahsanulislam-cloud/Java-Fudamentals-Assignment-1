package task1;

import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter average books per month: ");
        int v = scanner.nextInt();

        System.out.print("Enter annual visitors: ");
        int n = scanner.nextInt();

        double k = (v * 12.0) / n;

        System.out.println("Average books per visitor per year: " + k);

        scanner.close();
    }
}