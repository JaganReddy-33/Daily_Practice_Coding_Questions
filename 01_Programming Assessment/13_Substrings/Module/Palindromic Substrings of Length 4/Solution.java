import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str, int i, int j){
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void palindromicSubstring(String str){
        String s = "";
        for(int i=0; i<=str.length()-4; i++){
            int j = i+3;
            if(isPalindrome(str, i, j)){
                s = str.substring(i, j+1);
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        palindromicSubstring(str);
       
    }
}