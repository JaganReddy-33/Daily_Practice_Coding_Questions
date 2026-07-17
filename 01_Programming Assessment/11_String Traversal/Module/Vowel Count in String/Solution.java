import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String vowels = "AEIOUaeiou";
        int count = 0;
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(vowels.indexOf(ch) != -1){
                count++;
            }
        }
        System.out.print(count);
    }
}