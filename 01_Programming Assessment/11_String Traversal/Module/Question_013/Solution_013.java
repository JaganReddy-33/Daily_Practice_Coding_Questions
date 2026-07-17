import java.util.Scanner;

public class Main {

    public static void countChar(String input){
        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            count++;
        }
        System.out.print(count);
    }

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    // System.out.print(input.length());

    countChar(input);
 
 }

}