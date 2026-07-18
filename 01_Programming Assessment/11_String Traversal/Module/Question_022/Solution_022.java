import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.print(count);
       
    }
}