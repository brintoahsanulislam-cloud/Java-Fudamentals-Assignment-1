
package task4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle: " + area);

        } else {
            System.out.println("Invalid triangle sides.");
        }

        scanner.close();
    }
}
