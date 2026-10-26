import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        calculateUnicodeSum(s);
    }

    public static void calculateUnicodeSum(String s) {
        long sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }
        
        System.out.print(sum);
    }
}