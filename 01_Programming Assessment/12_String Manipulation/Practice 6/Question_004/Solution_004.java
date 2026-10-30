import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numericString = scanner.nextLine();
        
        removeLeadingZeros(numericString);
    }

    public static void removeLeadingZeros(String s) {

        int index = 0;
        while (index < s.length() && s.charAt(index) == '0') {
            index++;
        }
        
        if (index == s.length()) {
            System.out.print("0");
        } else {
            System.out.print(s.substring(index));
        }
    }
}