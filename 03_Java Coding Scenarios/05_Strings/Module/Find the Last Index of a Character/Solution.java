import java.util.Scanner;

class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                String ch  =scanner.nextLine();

                System.out.print(str.lastIndexOf(ch));
    }
}