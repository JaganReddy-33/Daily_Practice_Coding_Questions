import java.util.Scanner;

public class Main {

    public static void lowerToUpper(String input){
        String temp = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLowerCase(ch)){
                temp = temp + Character.toUpperCase(ch);
            } else {
                temp = temp + ch;
            }
        }
        System.out.print(temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        lowerToUpper(input);
       
    }
}