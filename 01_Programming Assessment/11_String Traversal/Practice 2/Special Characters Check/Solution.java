import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isSpecialChar = true;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                isSpecialChar = false;
                break;
            }
        }
        System.out.print((isSpecialChar)? "True" : "False");
    }
}