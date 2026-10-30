import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        moveNumericsToLast(str);
    }

    public static void moveNumericsToLast(String str) {
        StringBuilder nonDigits = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                digits.append(ch);
            } else {
                nonDigits.append(ch);
            }
        }
        System.out.print(nonDigits.toString() + digits.toString());
    }
}