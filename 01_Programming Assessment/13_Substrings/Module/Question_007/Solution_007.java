import java.util.Scanner;

public class Main {

    public static void checkCharString(String str1, String str2){
        int i=0;
        int j =0;

        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
            i++;
        }
        System.out.print((j==str2.length()) ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        checkCharString(str1, str2);
       
    }
}