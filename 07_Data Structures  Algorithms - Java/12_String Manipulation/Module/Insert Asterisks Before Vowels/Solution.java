import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            if(lowerCh=='a' || lowerCh=='e' || lowerCh=='i' || lowerCh=='o' || lowerCh=='u'){
                sb.append("*");
            }
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}