package com.immu;
import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculating area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Displaying the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}
