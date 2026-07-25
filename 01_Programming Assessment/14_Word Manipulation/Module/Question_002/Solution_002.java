import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");

        for(int i=1; i<arr.length; i+=2){
            System.out.print(arr[i]+" "+arr[i-1]+" ");
        }

        if(arr.length%2 != 0){
            System.out.print(arr[arr.length-1]);
        }
        
       
      
    }
}