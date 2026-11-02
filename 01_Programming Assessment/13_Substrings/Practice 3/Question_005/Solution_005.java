import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        if (isRotation(str1, str2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }
        
        String combined = s1 + s1;
        return combined.contains(s2);
    }
}