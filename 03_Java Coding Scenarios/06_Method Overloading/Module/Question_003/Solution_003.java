class Calculator {
    // Method to multiply two integers
   public int multiply(int a, int b){
    return a*b;
   }

    // Method to multiply three double numbers
   public double multiply(double a, double b, double c){
    return a*b*c;
   }

    // Method to multiply two float numbers
   public float multiply(float a, float b){
    return a*b;
   }

    // Method to multiply an integer and a double
    public double multiply(int a, double b){
        return a*b;
    }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator cal=new Calculator();
       

        // Call the multiply method for two integers
       System.out.println("Product of two integers: "+cal.multiply(5, 10));

        // Call the multiply method for three doubles
      System.out.println("Product of three doubles: "+cal.multiply(1.5, 2.5, 3.5));

        // Call the multiply method for two floats
       System.out.println("Product of two floats: "+cal.multiply(2.5f, 4.5f));

        // Call the multiply method for an integer and a double
      System.out.println("Product of an integer and a double: "+cal.multiply(6, 3.5));
    }
}