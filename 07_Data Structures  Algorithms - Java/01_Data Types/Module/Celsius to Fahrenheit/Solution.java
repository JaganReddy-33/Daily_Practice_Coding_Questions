import java.util.Scanner;

public class Main {
	
	static void celsiusToFahrenheit(int celsius)
	{
		double faheren = (celsius*(9/5))+32;

        System.out.printf("%.1f\n", faheren);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int celsius = scan.nextInt();
		celsiusToFahrenheit(celsius);
	}

}
