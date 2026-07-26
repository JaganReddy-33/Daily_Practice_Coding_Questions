import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();
        
        int asciiSum = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                asciiSum += c;
            }
        }
        
        System.out.println(asciiSum);
    }
}