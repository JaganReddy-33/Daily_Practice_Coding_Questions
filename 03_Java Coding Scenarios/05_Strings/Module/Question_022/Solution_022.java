import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    String str  =scanner.nextLine();

    String[] words = str.split("\\s+");

    for(String word : words){
        System.out.println(word);
    }
    }
}