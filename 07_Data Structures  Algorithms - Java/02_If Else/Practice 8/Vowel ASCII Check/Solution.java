import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num=='A'||num=='E'||num=='I'||num=='O'||num=='U'||num=='a'||num=='e'||num=='i'||num=='o'||num=='u')?"Yes":"No");
    }
}