class Calculator {
    // Method to divide two integers
    public int divide(int a, int b){
        return a/b;
    }

    // Method to divide three double numbers
    public double divide(double a, double b, double c){
        return a/b/c;
    }

    // Method to divide two float numbers
  public float divide(float a, float b){
    return a/b;
  }

    // Method to divide an integer by a double
    public double divide(int a, double b){
        return a/b;
    }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
      Calculator calc=new Calculator();

        // Call the divide method for two integers
      System.out.println("Quotient of two integers: "+calc.divide(20, 5));

        // Call the divide method for three doubles
       System.out.println("Quotient of three doubles: "+calc.divide(45.0, 3.0, 5.0));

        // Call the divide method for two floats
       System.out.println("Quotient of two floats: "+calc.divide(9.0f, 3.0f));

        // Call the divide method for an integer and a double
        System.out.println("Quotient of an integer and a double: "+calc.divide(30, 2.5));
       
    }
}