import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
       
       int count = 0;
       int index = 0;
       while((index = str1.indexOf(str2, index)) != -1){
        count++;
        index++;
       }
       System.out.print(count);
    }
}