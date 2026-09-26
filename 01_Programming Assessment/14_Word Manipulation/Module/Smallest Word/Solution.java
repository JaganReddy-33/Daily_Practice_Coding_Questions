import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minLen = Integer.MAX_VALUE;
        String smallWord = "";

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