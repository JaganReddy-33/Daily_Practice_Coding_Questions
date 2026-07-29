import java.util.Scanner;

abstract class Shape {
    float area;

    abstract void acceptInput();
    abstract void calcArea();

    public float getArea() {
        return area;
    }
}

class Square extends Shape {
    float side;

    @Override
    void acceptInput() {
        side = Main.sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    float length;
    float breadth;

    @Override
    void acceptInput() {
        length = Main.sc.nextFloat();
        breadth = Main.sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }
}

class Circle extends Shape {
    float radius;

    @Override
    void acceptInput() {
        radius = Main.sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = (float) (Math.PI * radius * radius);
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        if (!sc.hasNext()) {
            return;
        }

        String shapeType = sc.next();
        Shape shape = null;

        if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        }

        if (shape != null) {
            shape.acceptInput();
            shape.calcArea();
            System.out.println("Area of " + shapeType + ": " + shape.getArea());
        }
    }
}