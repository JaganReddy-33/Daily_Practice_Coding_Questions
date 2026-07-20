import java.util.Scanner;

public class Main {

    public static void moveSpeChars(String input){
        StringBuilder specialChar = new StringBuilder();
        StringBuilder nonSpeacialChar = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch!=' '){
                specialChar.append(ch);
            } else {
                nonSpeacialChar.append(ch);
            }
        }
        System.out.print(specialChar.toString() + nonSpeacialChar.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        moveSpeChars(input);
        
    }
}