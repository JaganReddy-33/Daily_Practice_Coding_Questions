import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int res = countWords(s);
		System.out.println(res);
	}

    public static int countWords(String s)  {
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }

        String[] arr = s.split("\\s+");
        return arr.length;
	}
}
