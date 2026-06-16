class ShapePerimeterCalculator {
    // Method to calculate the perimeter of a square
   public int calculatePerimeter(int a){
    return 4*a;
   }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double l, double w){
        return 2*(l + w);
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(double a){
        return 2*Math.PI*a;
    }

    // Method to calculate the perimeter of a triangle
  public int calculatePerimeter(int a, int b, int c){
    return a+b+c;
  }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the ShapePerimeterCalculator class
       ShapePerimeterCalculator cal = new ShapePerimeterCalculator();
        // Call the calculatePerimeter method for a square
       System.out.println("Perimeter of the square: "+cal.calculatePerimeter(4));

        // Call the calculatePerimeter method for a rectangle
       System.out.println("Perimeter of the rectangle: "+cal.calculatePerimeter(7.5, 3.5));

        // Call the calculatePerimeter method for a circle
       System.out.println("Perimeter of the circle: "+cal.calculatePerimeter(2.0));

        // Call the calculatePerimeter method for a triangle
       System.out.println("Perimeter of the triangle: "+cal.calculatePerimeter(3,4,5));
    }
}