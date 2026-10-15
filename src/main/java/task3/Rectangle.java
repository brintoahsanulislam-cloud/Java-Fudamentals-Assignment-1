
package task3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y1 - y2);

        int s = width * height;
        int p = 2 * (width + height);

        System.out.println("Area: " + s);
        System.out.println("Perimeter: " + p);

        scanner.close();
    }
}
