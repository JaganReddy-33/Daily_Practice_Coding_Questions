import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        stringConcatenationWithLengthAdjustment(str1, str2);
    }

    public static void stringConcatenationWithLengthAdjustment(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 > len2) {
            str1 = str1.substring(len1 - len2);
        } else if(len2 > len1) {
            str2 = str2.substring(len2 - len1);
        }

        System.out.print(str1 + str2);
    }
}