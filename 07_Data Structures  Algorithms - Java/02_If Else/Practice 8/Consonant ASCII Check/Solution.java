import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isLetter = (num >= 'A' && num <= 'Z') || (num >= 'a' && num <= 'z');

        boolean isVowel = num == 'A' || num == 'E' || num == 'I' || num == 'O' || num == 'U' || num == 'a' || num == 'e' || num == 'i' || num == 'o' || num == 'u';
        
        System.out.println((isLetter && !isVowel) ? "Yes" : "No");
    }
}