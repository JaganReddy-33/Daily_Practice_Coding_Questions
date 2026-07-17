import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isFound = false;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                System.out.print(ch+" ");
                isFound = true;
            }
        }
        if(!isFound){
            System.out.print("No valid characters found.");
        }      
    }
}