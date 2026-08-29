import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        String input = scanner.nextLine();
        processAndPrintDomains(input);
    }

    private static void processAndPrintDomains(String input) {
        Set<String> domains = extractDomains(input);
        for (String domain : domains) {
            System.out.println(domain);
        }
    }

    private static Set<String> extractDomains(String input) {
        Set<String> domains = new LinkedHashSet<>();
        String[] urls = input.split(",");
        for (String url : urls) {
            String domain = parseDomain(url);
            if (!domain.isEmpty()) {
                domains.add(domain);
            }
        }
        return domains;
    }

    private static String parseDomain(String url) {
        int idx = url.indexOf("://");
        if (idx != -1) {
            return url.substring(idx + 3);
        }
        return url;
    }
}