import java.util.Scanner;

public class Main {

    public static void countUpperCaseChar(String input){
        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            // if(ch>='A' && ch<='Z'){
            //     count++;
            // }

            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        countUpperCaseChar(input);
    }

}