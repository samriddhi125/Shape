package Part_A;

abstract class Shape {
    // Non-abstract method to show the selected shape
    public void showShape(String shape) {
        System.out.println("Selected Shape: " + shape);
    }

    // Abstract methods to calculate area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
