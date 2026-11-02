import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        stringEndsWithChecker(str1, str2);
    }

    public static void stringEndsWithChecker(String str1, String str2) {
        if(str1.endsWith(str2)){
            System.out.print("The main string ends with the provided string.");
        } else {
            System.out.print("The main string does not end with the provided string.");
        }
    }
}