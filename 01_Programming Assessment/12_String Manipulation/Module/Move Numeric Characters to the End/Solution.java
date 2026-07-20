import java.util.Scanner;

public class Main {

    public static void moveNumericChar(String input){
        StringBuilder nonDigits = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                digits.append(ch);
            } else {
                nonDigits.append(ch);
            }
        }
        System.out.println(nonDigits.toString() + digits.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        moveNumericChar(input);
       
    }
}