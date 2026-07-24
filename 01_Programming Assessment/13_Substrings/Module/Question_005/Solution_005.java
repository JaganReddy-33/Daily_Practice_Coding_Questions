import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();

        int count = 0;
        int index = 0;
        while((index = str.indexOf(sub, index)) != -1){
            count++;
            index = index + sub.length();
        }
        System.out.print(count);
        
    }

    
}