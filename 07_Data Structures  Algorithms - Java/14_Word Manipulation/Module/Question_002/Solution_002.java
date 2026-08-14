import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLen = Integer.MIN_VALUE;
        String largeWord = "";

        while(scanner.hasNext()){
            String word = scanner.next();
            if(word.length() > maxLen){
                maxLen = word.length();
                largeWord = word;
            }
        }
        System.out.print(largeWord);
        
    }

}