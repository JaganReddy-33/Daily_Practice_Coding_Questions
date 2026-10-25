import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        findLastVowel(s);
    }

    public static void findLastVowel(String s){
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            char lowerch = Character.toLowerCase(ch);

            if(lowerch == 'a' || lowerch=='e' || lowerch=='i' || lowerch=='o' || lowerch=='u'){
                System.out.print(ch);
                return;
            }
        }
        System.out.print("-1");
    }
}