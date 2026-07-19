import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            } else {
                break;
            }
        }
        System.out.print(count);
    }
}