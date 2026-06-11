import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.print(str1.equalsIgnoreCase(str2));
    }
}