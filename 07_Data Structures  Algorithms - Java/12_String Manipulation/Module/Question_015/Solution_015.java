import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            boolean isSpeChar = !Character.isLetterOrDigit(ch);

            if(!isSpeChar){
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }
}