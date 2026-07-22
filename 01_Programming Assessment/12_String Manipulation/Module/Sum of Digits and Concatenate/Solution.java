import java.util.Scanner;

public class Main {

    public static void sumOfDigits(String input){
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                sum = sum + ch-'0';
            } else {
                sb.append(ch);
            }
        }
        System.out.print(sb.toString()+sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        sumOfDigits(input);
   
    }

   
}