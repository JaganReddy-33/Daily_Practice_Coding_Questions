import java.util.Scanner;
public class Main {
     static void largestNumber(int[] ar)
    {
    	int largestVal = ar[0];
        for(int i=0; i<ar.length; i++){
            if(ar[i] > largestVal){
                largestVal = ar[i];
            }
        }
        System.out.print(largestVal);
        
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		largestNumber(ar);
	}
}