import java.util.Scanner;

public class Main {

    public static void countSpChar(String input){
        int count = 0;
        boolean isFound = false;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            // if(!(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z') && !(ch>='0' && ch<='9') && ch!=' '){
            //     count++;
            //     isFound = true;
            // }

            if(ch != ' ' && !Character.isLetterOrDigit(ch)){
                count++;
                isFound = true;
            }
        }
        System.out.print(count);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        countSpChar(input);

       
    }
}