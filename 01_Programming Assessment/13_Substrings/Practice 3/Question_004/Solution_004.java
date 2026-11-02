import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        
        divideString(s, n);
    }

    public static void divideString(String s, int n) {
        int length = s.length();
        
        if (length % n != 0) {
            System.out.print("Not able to divide into n equal parts");
            return;
        }
        
        int partLength = length / n;
        
        for (int i = 0; i < length; i += partLength) {
            String part = s.substring(i, i + partLength);
            System.out.println(part);
        }
    }
}