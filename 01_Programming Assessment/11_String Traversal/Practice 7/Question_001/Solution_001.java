import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        findLastConsonant(s);
    }

    public static void findLastConsonant(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            
            if (Character.isLetter(ch) && 
                lowerCh != 'a' && lowerCh != 'e' && lowerCh != 'i' && lowerCh != 'o' && lowerCh != 'u') {
                System.out.print(ch);
                return;
            }
        }
        
        System.out.print("-1");
    }
}