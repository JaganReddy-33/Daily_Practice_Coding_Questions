import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String result = str.replaceAll("[aeiouAEIOU]", "#");
            System.out.println(result);
        }
    }
}