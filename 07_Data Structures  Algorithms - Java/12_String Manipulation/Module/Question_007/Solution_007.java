import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder speChar = new StringBuilder();
        StringBuilder nonSpecChar = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(!Character.isLetterOrDigit(ch) && ch!=' '){
                speChar.append(ch);
            } else {
                nonSpecChar.append(ch);
            }
        }
        System.out.print(speChar.append(nonSpecChar).toString());
        
    }
}