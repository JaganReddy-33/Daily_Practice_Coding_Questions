import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(Character.isLetter(ch)){
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    count++;
                }
            }
        }
        System.out.print((count > 5)? "True" : "False");
    }
}