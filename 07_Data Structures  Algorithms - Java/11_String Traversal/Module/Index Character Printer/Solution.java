import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int idx = scanner.nextInt();

        if(idx >= input.length() || input.isEmpty()){
            System.out.print("Invalid index");
            return;
        }

        System.out.print(input.charAt(idx));
       
    }
}