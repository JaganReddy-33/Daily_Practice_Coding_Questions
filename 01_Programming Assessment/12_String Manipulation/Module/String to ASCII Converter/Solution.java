import java.util.Scanner;

public class Main {

    public static void stringConverter(String input){
        String res = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            System.out.print((int) ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        stringConverter(input);
       
    }
}