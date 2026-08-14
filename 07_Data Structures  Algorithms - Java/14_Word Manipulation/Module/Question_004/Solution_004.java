import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String word = scanner.next();
            System.out.print(word+word.length()+" ");
        }
        
       
    }
}