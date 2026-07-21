import java.util.Scanner;

public class Main {

    public static void removeLC(String input){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(!Character.isLowerCase(ch)){
                str.append(ch);
            }
        }
        System.out.print(str.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        removeLC(input);
       
    }
}