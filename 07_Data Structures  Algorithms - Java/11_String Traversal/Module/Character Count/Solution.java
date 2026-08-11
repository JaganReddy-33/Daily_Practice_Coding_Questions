import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    int count = 0;
    for(int i=0; i<input.length(); i++){
        count++;
    }
    System.out.print(count);
 
 }

}