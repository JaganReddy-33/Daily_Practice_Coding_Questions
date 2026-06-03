class Main{
    public static void main(String[] args) {
        float a = 123.45f; // You can change this value for testing

        // Perform explicit type casting from float to int
        int b = (int)a;

        // Perform type casting from int to byte
        byte c =(byte) b;

        // Print the original float, the casted integer, and the casted byte
        System.out.println("Original float: " + a);
        System.out.println("Casted integer: " + b);
        System.out.println("Casted byte: " + c);
    }
}