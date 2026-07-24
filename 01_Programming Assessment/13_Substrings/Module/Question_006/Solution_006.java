import java.util.Scanner;

public class Main {

    public static void printSubstring(String str){
        String s = "";

        for(int len = 1; len<=str.length(); len++){
            for(int i=0; i<=str.length()-len; i++){
                int j = i+len-1;
                s = str.substring(i, j+1);
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        printSubstring(str);
        
    }
}