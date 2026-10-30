import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        asciiConcatenator(str);
    }

    public static void asciiConcatenator(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            sb.append((int) ch).append(ch);
        }
        System.out.print(sb.toString());
    }
}