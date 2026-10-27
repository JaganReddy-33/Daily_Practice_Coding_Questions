import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        removeCharacters(s);
    }

    public static void removeCharacters(String s) {

        String res = s.replace("b", "");
        
        res = res.replace("ac", "");
        
        if (res.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(res);
        }
    }
}