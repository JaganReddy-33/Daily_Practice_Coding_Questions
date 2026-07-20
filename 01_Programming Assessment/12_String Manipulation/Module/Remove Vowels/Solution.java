import java.util.Scanner;

public class Main {

    public static void removeVowels(String input){
        String temp = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                continue;
            } else {
                temp = temp + ch;
            }
        }
        System.out.print(temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        removeVowels(input);
      
    }
}