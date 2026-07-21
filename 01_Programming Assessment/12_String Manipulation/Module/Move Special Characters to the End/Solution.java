import java.util.Scanner;

public class Main {

    public static void moveSpcChars(String input){
        StringBuilder speChars = new StringBuilder();
        StringBuilder nonSpeChars = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch) || ch==' '){
                nonSpeChars.append(ch);
            } else {
                speChars.append(ch);
            }
        }
        System.out.print(nonSpeChars.toString()+speChars.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        moveSpcChars(input);
        
    }
}