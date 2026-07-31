import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            if(ch != ' '){
                set.add(ch);
            }
        }

        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ (i == list.size()-1 ? "" : " "));
        }
    }
}