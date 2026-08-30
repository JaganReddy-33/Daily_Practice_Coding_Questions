import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        countCharOccurrences(str);
    }

    public static void countCharOccurrences(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch != ' ') {
                counts.put(ch, counts.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}