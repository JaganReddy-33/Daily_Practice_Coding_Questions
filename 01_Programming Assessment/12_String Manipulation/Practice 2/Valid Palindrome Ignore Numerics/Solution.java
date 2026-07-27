import java.util.Scanner;

class Main {

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(Character.isDigit(str.charAt(left))){
                left++;
                continue;
            }
            if(Character.isDigit(str.charAt(right))){
                right--;
                continue;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print(isPalindrome(str) ? "True" : "Fa");
    }
}