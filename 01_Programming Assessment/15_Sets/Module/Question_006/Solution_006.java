import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        processAndPrintUrls(line);
    }

    public static void processAndPrintUrls(String line) {
        String[] urls = line.split(",");
        TreeSet<String> set = new TreeSet<>();
        for (String url : urls) {
            set.add(url);
        }
        for (String url : set) {
            System.out.println(url);
        }
    }
}