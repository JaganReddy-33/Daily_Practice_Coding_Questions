import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        colourStringChecker(str);
    }

    public static void colourStringChecker(String str) {

        if(str.startsWith("red")) {
            System.out.print("red");
        } else if(str.startsWith("black")) {
            System.out.print("black");
        } else {
            System.out.print("-1");
        }
    }
}