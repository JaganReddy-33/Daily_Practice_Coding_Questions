import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        findFirstConsonant(s);
    }

    public static void findFirstConsonant(String s) {

        for (int i = 0; i < s.length(); i++) {
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