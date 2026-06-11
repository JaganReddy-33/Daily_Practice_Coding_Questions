import java.util.*;

public class Main {

    public static int secondlargestNumber(int[] arr) {
        int largestVal = Integer.MIN_VALUE;
        int secondLargestVal = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largestVal){
                secondLargestVal = largestVal;
                largestVal = arr[i];
            } else if(arr[i] > secondLargestVal){
                secondLargestVal = arr[i];
            }
        }
        return secondLargestVal;
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		System.out.println(secondlargestNumber(ar));
        
    }
}