package Part_A;

class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return baseLength * baseWidth + baseLength * Math.sqrt(Math.pow((baseWidth / 2), 2) + Math.pow(height, 2))
                + baseWidth * Math.sqrt(Math.pow((baseLength / 2), 2) + Math.pow(height, 2));
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Not applicable for a pyramid
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }
}

