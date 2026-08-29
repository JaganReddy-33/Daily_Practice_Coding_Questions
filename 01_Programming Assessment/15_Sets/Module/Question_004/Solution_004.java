import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        collectAndPrintUniqueNames(names);
    }

    public static void collectAndPrintUniqueNames(String[] names) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String name : names) {
            set.add(name);
        }
        for (String name : set) {
            System.out.println(name);
        }
    }
}