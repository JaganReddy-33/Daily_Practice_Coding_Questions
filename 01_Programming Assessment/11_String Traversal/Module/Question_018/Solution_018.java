import java.util.Scanner;

public class Main {

    public static void countLowerCaseChar(String input){
        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            // if(ch>='a' && ch<='z'){
            //     count++;
            // }

            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        countLowerCaseChar(input);
    }

}