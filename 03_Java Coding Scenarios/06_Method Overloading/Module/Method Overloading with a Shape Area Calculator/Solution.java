class ShapeAreaCalculator {
    // Method to calculate the area of a square
    public int calculateArea(int a){
        return a*a;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double l, double w){
        return l*w;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double a){
        return Math.PI * a * a;
    }

    // Method to calculate the area of a triangle
  public double calculateArea(int b, double h){
    return 0.5 * b*h;
  }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the ShapeAreaCalculator class
      ShapeAreaCalculator cal= new ShapeAreaCalculator();

        // Call the calculateArea method for a square
      System.out.println("Area of the square: "+cal.calculateArea(5));

        // Call the calculateArea method for a rectangle
       System.out.println("Area of the rectangle: "+cal.calculateArea(7.5, 4.0));

        // Call the calculateArea method for a circle
       System.out.println("Area of the circle: "+cal.calculateArea(3.0));

        // Call the calculateArea method for a triangle
      System.out.println("Area of the triangle: "+cal.calculateArea(8, 6.5));
    }
}