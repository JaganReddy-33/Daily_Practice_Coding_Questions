import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        mergeAlternately(str1, str2);
    }

    public static void mergeAlternately(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int maxLen = Math.max(len1, len2);
        
        for (int i = 0; i < maxLen; i++) {
            if (i < len1) {
                sb.append(str1.charAt(i));
            }
            if (i < len2) {
                sb.append(str2.charAt(i));
            }
        }
        
        System.out.print(sb.toString());
    }
}