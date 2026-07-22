import java.util.Scanner;

public class Main {

    public static void removeAlphanumeric(String input){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        removeAlphanumeric(input);
    }

 }