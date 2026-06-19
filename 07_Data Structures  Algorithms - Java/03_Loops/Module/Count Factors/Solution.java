import java.util.*;

public class Main {
  static void countFactors(int n)
	{
        int count = 0;
		for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.print(count);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		countFactors(n);
	}
}