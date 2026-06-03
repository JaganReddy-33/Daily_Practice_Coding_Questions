import java.util.Scanner;

class Main {

    // Define the method to subtract two integers and return the difference
    public static int subtraction(int x, int y){
        return x - y;
    }


    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user, each on a separate line
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = subtraction(a, b);
        System.out.println(result);
    }

  
}