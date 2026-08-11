import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.print(count);
    }

}