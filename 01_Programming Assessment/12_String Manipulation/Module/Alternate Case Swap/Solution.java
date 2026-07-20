import java.util.Scanner;

public class Main {

    public static void alternateCaseSwap(String str){
        String res = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                // res = res + Character.toLowerCase(ch);
                // res = res +(char)(ch+32);
            } else if(Character.isLowerCase(ch)){
                res = res + Character.toUpperCase(ch);
                // res = res + (char)(ch-32);
            } else {
                res = res + ch;
            }
        }
        System.out.print(res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        alternateCaseSwap(input);
    
    }

}