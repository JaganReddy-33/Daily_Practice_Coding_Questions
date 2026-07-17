import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isFound = false;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch>='0' && ch<='9'){
                System.out.print(ch+" ");
                isFound = true;
            }
        }
        if(!isFound){
            System.out.print("No numbers found.");
        }
     
    }
}