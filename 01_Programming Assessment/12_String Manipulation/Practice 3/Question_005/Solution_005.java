import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        reverseSubstring(s, start, end);
    }

    public static void reverseSubstring(String s, int start, int end) {

        start = Math.max(0, start);
        end = Math.min(s.length() - 1, end);
        
        if (start >= end) {
            System.out.print(s);
            return;
        }
        
        char[] chars = s.toCharArray();
        
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        
        System.out.print(new String(chars));
    }
}