import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String smallWord = "";
        int minLen = Integer.MAX_VALUE;

        while(scanner.hasNext()){
            String word = scanner.next();

            if(word.length() < minLen){
                minLen = word.length();
                smallWord = word;
            }
        }
        System.out.print(smallWord);
        
    }

    
}