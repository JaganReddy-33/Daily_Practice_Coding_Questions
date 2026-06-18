import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char c = (char)num;
        if(Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}