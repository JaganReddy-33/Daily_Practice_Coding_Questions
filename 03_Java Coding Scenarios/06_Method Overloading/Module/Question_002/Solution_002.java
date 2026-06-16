class Calculator {
    // Method to subtract two integers
    public int subtract(int a, int b){
        return a-b;
    }

    // Method to subtract three double numbers
    public double subtract(double a, double b, double c){
        return a-b-c;
    }

    // Method to subtract two float numbers
    public float subtract(float a, float b){
        return a-b;
    }

    // Method to subtract a double from an integer
    public double subtract(int a, double b){
        return a - b;
    } 
}

class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calculator = new Calculator();

        // Call the subtract method for two integers
        int intDiff = calculator.subtract(20, 10);
        System.out.println("Difference of two integers: " + intDiff);

        // Call the subtract method for three doubles
        double doubleDiff = calculator.subtract(10.5, 4.5, 2.0);
        System.out.println("Difference of three doubles: " + doubleDiff);

        // Call the subtract method for two floats
        float floatDiff = calculator.subtract(7.5f, 3.5f);
        System.out.println("Difference of two floats: " + floatDiff);

        // Call the subtract method for an integer and a double
        double mixedDiff = calculator.subtract(15, 7.5);
        System.out.println("Difference of an integer and a double: " + mixedDiff);
    }
}