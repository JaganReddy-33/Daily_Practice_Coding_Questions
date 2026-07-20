import java.util.Scanner;

public class Main {

    public static void upperToLower(String input){
        String temp = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                temp += Character.toLowerCase(ch);
            } else {
                temp += ch;
            }
        }
        System.out.print(temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        upperToLower(input);
       
    }
}