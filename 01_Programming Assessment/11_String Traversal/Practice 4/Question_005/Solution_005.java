import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        int index = str.indexOf(ch);
        if(index == -1 || index == str.length()-1){
            System.out.print(-1);
            return;
        }

        StringBuilder result = new StringBuilder();
        for(int i=index+1; i<str.length(); i++){
            char c = str.charAt(i);
            if("aeiouAEIOU".indexOf(c) != -1){
                result.append(c);
            }
        }

        if(result.length() > 0){
            System.out.print(result.toString());
        } else {
            System.out.print(-1);
        }
       
    }
}