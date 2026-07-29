import java.util.Scanner;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeType = scanner.next();

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            Shape shape = new Rectangle(length, width);
            System.out.printf("Area of Rectangle: %.2f\n", shape.getArea());
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            double radius = scanner.nextDouble();
            Shape shape = new Circle(radius);
            System.out.printf("Area of Circle: %.2f\n", shape.getArea());
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            double base = scanner.nextDouble();
            double height = scanner.nextDouble();
            Shape shape = new Triangle(base, height);
            System.out.printf("Area of Triangle: %.2f\n", shape.getArea());
        }
    }
}