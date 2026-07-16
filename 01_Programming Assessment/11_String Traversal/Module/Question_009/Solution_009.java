import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int i=0;
        int j=input.length()-1;
        boolean isPalindrome = true;
        while(i<j){
            if(input.charAt(i) != input.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.print(isPalindrome ? "Yes" : "No");



    }
}