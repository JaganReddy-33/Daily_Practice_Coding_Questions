import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        processAndPrintUrls(input);
    }

    public static void processAndPrintUrls(String input) {
        String[] urls = input.split(",");
        TreeSet<String> set = new TreeSet<>();
        for (String url : urls) {
            set.add(url);
        }
        for (String url : set) {
            System.out.println(url);
        }
    }
}