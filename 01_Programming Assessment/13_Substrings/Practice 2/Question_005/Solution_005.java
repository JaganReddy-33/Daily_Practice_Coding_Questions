import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        if (s.contains("ravi")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}