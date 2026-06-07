import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ascii_val = scanner.nextInt();
        // Your code goes here
        if((ascii_val >= 65 && ascii_val <= 90) || (ascii_val >= 97 && ascii_val <= 122)){
            System.out.print("Alphabet");
        } else {
            System.out.print("Not an alphabet");
        }
    }
}