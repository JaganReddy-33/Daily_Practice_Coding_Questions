import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String temp = "";

        for(int i=0; i<input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch == 'a'){
                temp = temp + ("*" + ch);
            } else {
                temp = temp +ch;
            }
        }
        System.out.print(temp);
       
    }
}