import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        CheckStartString(str1, str2);
    }

    public static void CheckStartString(String str1, String str2) {
        if(str1.startsWith(str2)) {
            System.out.print("The main string starts with the given string.");
        } else {
            System.out.print("The main string does not start with the given string.");
        }
    }
}