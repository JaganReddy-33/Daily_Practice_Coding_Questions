import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch  = sc.next().charAt(0);

        int index = str.indexOf(ch);
        if(index!=-1 && index+1<str.length()){
            System.out.print(str.substring(index+1));
        } else {
            System.out.println();
        }
    }
}