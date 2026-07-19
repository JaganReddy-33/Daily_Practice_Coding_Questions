import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt();
            if(Character.isDigit(ch)){
                count++;
            }
        }
        System.out.print((input.length() == count) ? "Yes" : "No");
    }
}