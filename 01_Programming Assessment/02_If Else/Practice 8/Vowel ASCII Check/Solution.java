import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num==65 || num==69 || num==73 || num==79 || num==85 || 
        num==97 || num==101 || num==105 || num==111 || num==117){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}