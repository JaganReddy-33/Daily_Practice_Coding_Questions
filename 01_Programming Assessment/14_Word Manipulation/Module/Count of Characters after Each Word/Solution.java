import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String str = scanner.next();
            System.out.print(str+str.length()+" ");
        } 
    }
}