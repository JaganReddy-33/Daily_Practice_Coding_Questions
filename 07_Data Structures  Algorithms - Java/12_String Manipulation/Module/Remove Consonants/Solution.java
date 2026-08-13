import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                char lowerCh = Character.toLowerCase(ch);
                boolean isConsonant = Character.isLetter(ch) && 
                    !(lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u');

                if (!isConsonant) {
                    sb.append(ch);
                }
            }

            System.out.println(sb.toString());
        }
    }
}