class Calculator {
    // Method to add two integers
   public int add(int a, int b){
    return a+b;
   }

    // Method to add three double numbers
   public double add(double a, double b, double c){
    return a+b+c;
   }

    // Method to add two float numbers
   public float add(float a, float b){
    return a+b;
   }

    // Method to add one integer and one double
   public double add(int a, double b){
    return a+b;
   }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calculator = new Calculator();

        // Call the add method for two integers
        int intSum = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + intSum);

        // Call the add method for three doubles
        double doubleSum = calculator.add(3.5, 4.5, 5.5);
        System.out.println("Sum of three doubles: " + doubleSum);

        // Call the add method for two floats
        float floatSum = calculator.add(2.5f, 3.5f);
        System.out.println("Sum of two floats: " + floatSum);

        // Call the add method for an integer and a double
        double mixedSum = calculator.add(4, 7.5);
        System.out.println("Sum of an integer and a double: " + mixedSum);
    }
}