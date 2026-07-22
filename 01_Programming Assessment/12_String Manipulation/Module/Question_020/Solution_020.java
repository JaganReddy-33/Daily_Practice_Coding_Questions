import java.util.Scanner;

public class Main {

    public static void replaceUpperCaseLetters(String input){
        String res = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                res = res + "#";
            } else {
                res = res + ch;
            }
        }
        System.out.print(res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        replaceUpperCaseLetters(input);
      
    }

   
}