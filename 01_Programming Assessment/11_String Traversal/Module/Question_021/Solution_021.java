import java.util.Scanner;

public class Main {

    public static int countVowels(String input, int count){
        for(int i=0; i<input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String input, int count){
        for(int i=0; i<input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(Character.isLetter(ch)){
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    count++;
                }
            }
        }
        return count;
    }

    public static int countSpChar(String input, int count){
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        int vowles = countVowels(input, count);
        System.out.println("Vowels: "+vowles);
        int consonants = countConsonants(input, count);
        System.out.println("Consonants: "+consonants);
        int spChar = countSpChar(input, count);
        System.out.println("Special Characters: "+spChar);
    }
}