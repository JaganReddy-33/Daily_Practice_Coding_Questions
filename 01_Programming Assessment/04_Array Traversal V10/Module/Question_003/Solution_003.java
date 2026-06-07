import java.util.Scanner;
public class Main {
    static void smallestNumber(int[] ar)
    {
        int smallVal = ar[0];
        for(int i=1; i<ar.length; i++){
            if(smallVal > ar[i]){
                smallVal = ar[i];
            }
        } 
        System.out.print(smallVal); 	
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