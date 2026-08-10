import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean found = false;
        for(int i=0; i<input.length(); i+=2){
            char ch = input.charAt(i);
            System.out.print(ch+" ");
            found = true;
        }
        if(!found){
            System.out.print("No characters found at even indices.");
        }
       
    }
}