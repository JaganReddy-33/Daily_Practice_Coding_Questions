import java.util.Scanner;

public class Main {

    public static void removeConsonants(String input){
        StringBuilder str = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch >= '0' && ch<='9' || !Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }
        System.out.print(str.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        removeConsonants(input);
    }
}