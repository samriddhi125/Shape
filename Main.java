package Part_A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("a) Circle");
        System.out.println("b) Rectangle");
        System.out.println("c) Square");
        System.out.println("d) Sphere");
        System.out.println("e) Cylinder");
        System.out.println("f) Pyramid");

        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                System.out.println("Enter the radius of the circle:");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                circle.showShape("Circle");
                System.out.println("Area: " + circle.calculateArea());
                System.out.println("Perimeter: " + circle.calculatePerimeter());
                break;

            case 'b':
                System.out.println("Enter the length and width of the rectangle:");
                double rectLength = scanner.nextDouble();
                double rectWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectLength, rectWidth);
                rectangle.showShape("Rectangle");
                System.out.println("Area: " + rectangle.calculateArea());
                System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                break;

            case 'c':
                System.out.println("Enter the side of the square:");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                square.showShape("Square");
                System.out.println("Area: " + square.calculateArea());
                System.out.println("Perimeter: " + square.calculatePerimeter());
                break;

            case 'd':
                System.out.println("Enter the radius of the sphere:");
                double sphereRadius = scanner.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                sphere.showShape("Sphere");
                System.out.println("Surface Area: " + sphere.calculateArea());
                System.out.println("Volume: " + sphere.calculateVolume());
                break;

            case 'e':
                System.out.println("Enter the radius and height of the cylinder:");
                double cylRadius = scanner.nextDouble();
                double cylHeight = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
                cylinder.showShape("Cylinder");
                System.out.println("Surface Area: " + cylinder.calculateArea());
                System.out.println("Volume: " + cylinder.calculateVolume());
                break;

            case 'f':
                System.out.println("Enter the base length, base width, and height of the pyramid:");
                double pyramidLength = scanner.nextDouble();
                double pyramidWidth = scanner.nextDouble();
                double pyramidHeight = scanner.nextDouble();
                Pyramid pyramid = new Pyramid(pyramidLength, pyramidWidth, pyramidHeight);
                pyramid.showShape("Pyramid");
                System.out.println("Surface Area: " + pyramid.calculateArea());
                System.out.println("Volume: " + pyramid.calculateVolume());
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        scanner.close();
    }
}
