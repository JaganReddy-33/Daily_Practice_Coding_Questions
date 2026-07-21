import java.util.Scanner;

public class Main {

    public static void insertAsterisks(String input){
        StringBuilder numChars = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                numChars.append("*").append(ch);
            } else {
                numChars.append(ch);
            }
        }
        System.out.print(numChars.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       
       insertAsterisks(input);
    }
}