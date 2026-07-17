import java.util.Scanner;

public class Main {

    public static void countAlphanumeric(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            //     count++;
            // }

            if(Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        countAlphanumeric(s);
        
    }

}