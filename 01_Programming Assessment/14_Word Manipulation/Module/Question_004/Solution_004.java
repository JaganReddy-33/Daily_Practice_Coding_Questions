import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rev = "";
        while(scanner.hasNext()){
            String word = scanner.next();
            for(int i=word.length()-1; i>=0; i--){
                rev+=word.charAt(i);
            }
            System.out.print(rev+" ");
            rev = "";
        }

        
    }
}