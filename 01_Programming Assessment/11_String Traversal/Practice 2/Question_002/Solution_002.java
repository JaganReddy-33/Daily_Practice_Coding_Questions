import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean found = true;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                found = false;
            }
        }
        if(found){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}