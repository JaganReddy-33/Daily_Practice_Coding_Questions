import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        processAndPrintCompanies(input);
    }

    private static void processAndPrintCompanies(String input) {
        TreeSet<String> companies = extractCompanies(input);
        for (String company : companies) {
            System.out.println(company);
        }
    }

    private static TreeSet<String> extractCompanies(String input) {
        TreeSet<String> companies = new TreeSet<>();
        String[] urls = input.split(",");
        for (String url : urls) {
            String company = parseCompany(url);
            if (!company.isEmpty()) {
                companies.add(company);
            }
        }
        return companies;
    }

    private static String parseCompany(String url) {
        int start = url.indexOf("www.");
        if (start != -1) {
            start += 4;
        } else {
            start = url.indexOf("://");
            if (start != -1) {
                start += 3;
            } else {
                start = 0;
            }
        }
        int end = url.indexOf(".", start);
        if (end != -1) {
            return url.substring(start, end);
        }
        return "";
    }
}