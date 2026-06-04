import java.util.Scanner;

public class Main {
	
	static void celsiusToFahrenheit(int celsius)
	{
		double fah = (celsius * 9.0/5) + 32;
        System.out.printf("%.1f\n", fah);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int celsius = scan.nextInt();
		celsiusToFahrenheit(celsius);
	}

}
