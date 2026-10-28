import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String target = scanner.nextLine();
        int targetIdx = scanner.nextInt();

        insertString(s, target, targetIdx);
    }

    public static void insertString(String s, String target, int targetIdx){

        StringBuilder sb = new StringBuilder(s);
        sb.insert(targetIdx, target);
        System.out.print(sb.toString());
    }
}