import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String s = "";

        for(int i=0; i<input.length(); i++){
            char ch =Character.toLowerCase(input.charAt(i));
            if(ch == 'a'){
                s += "*" + ch;
            } else {
                s += ch;
            }
        }
        System.out.print(s);
       
    }
}