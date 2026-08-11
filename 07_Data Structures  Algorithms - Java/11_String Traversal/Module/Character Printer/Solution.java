import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean found = false;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                System.out.print(ch+" ");
                found = true;
            }
        }

        if(!found){
            System.out.print("No valid characters found.");
        }
      
    }
}