import java.util.Scanner;

public class Main {

    public static void countNumericChar(String input){
        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            // if(ch>='0' && ch<='9'){
            //     count++;
            // }

            if(Character.isDigit(ch)){
                count
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        countNumericChar(input);
        
    }

}