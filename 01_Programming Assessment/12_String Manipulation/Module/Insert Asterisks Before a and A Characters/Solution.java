import java.util.Scanner;

public class Main {

    public static void insertAsterisks(String input){
        StringBuilder str = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='a' || ch=='A'){
                str.append("*").append(ch);
            } else {
                str.append(ch);
            }
        }
        System.out.print(str.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        insertAsterisks(input);
       
    }
}