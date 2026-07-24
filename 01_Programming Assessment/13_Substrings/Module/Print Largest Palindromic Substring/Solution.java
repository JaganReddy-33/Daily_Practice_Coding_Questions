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

    public static void largestPalindrome(String str) {
        int maxLen = 0;
        String ans = "";
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                if(isPalindrome(str, i, j)){
                    int len = j-i+1;
                    if(len > maxLen){
                        maxLen = len;
                        ans = str.substring(i, j+1);
                    }
                }
            }
        }
        System.out.print(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        largestPalindrome(str);
    }
}