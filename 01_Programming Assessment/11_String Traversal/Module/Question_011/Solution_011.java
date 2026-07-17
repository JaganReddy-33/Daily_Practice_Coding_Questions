import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isSpChar = false;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                System.out.print(ch+" ");
                isSpChar = true;
            }
        }
        if(!isSpChar){
            System.out.print("No special characters found.");
        }
       
    }
}