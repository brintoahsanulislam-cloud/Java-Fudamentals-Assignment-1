
package task2;

import java.util.Scanner;

public class FloorTiles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter room length: ");
        int length = scanner.nextInt();

        System.out.print("Enter room width: ");
        int width = scanner.nextInt();

        System.out.print("Enter tile price per square meter: ");
        double price = scanner.nextDouble();

        int area = length * width;

        double totalCost = area * 1.05 * price;

        System.out.println("Floor area: " + area);
        System.out.println("Total cost including 5% extra: " + totalCost);

        scanner.close();
    }
}
