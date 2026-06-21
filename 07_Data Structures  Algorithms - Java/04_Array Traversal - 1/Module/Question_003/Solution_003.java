import java.util.Scanner;
public class Main {
    static void smallestNumber(int[] ar)
    {
    	int smallestVal = ar[0];
        for(int i=0; i<ar.length; i++){
            if(ar[i] < smallestVal){
                smallestVal = ar[i];
            }
        }
        System.out.print(smallestVal);
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		smallestNumber(ar);
	}
    
}