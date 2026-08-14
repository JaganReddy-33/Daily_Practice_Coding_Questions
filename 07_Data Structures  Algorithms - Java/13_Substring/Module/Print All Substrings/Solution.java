import java.util.Scanner;

public class Main {

    public static void printSubstrings(String str){
        StringBuilder sb = new StringBuilder();

        for(int len=1; len<=str.length(); len++){
            for(int i=0; i<=str.length()-len; i++){
               sb.append(str.substring(i, i+len)).append("\n");
            }
        }
        System.out.print(sb);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        printSubstrings(str);
        
    }
}