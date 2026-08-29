import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        System.out.println(replaceChar(s, ch));
    }

    public static String replaceChar(String str, char target) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = '*';
            }
        }
        return new String(arr);
    }
}