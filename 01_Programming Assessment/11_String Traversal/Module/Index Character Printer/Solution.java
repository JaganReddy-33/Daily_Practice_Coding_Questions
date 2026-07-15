import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int idx = scanner.nextInt();

        if(idx <0 || idx >= input.length()){
            System.out.println("Invalid index");
            return;
        }
        System.out.println(input.charAt(idx));
       
    }
}