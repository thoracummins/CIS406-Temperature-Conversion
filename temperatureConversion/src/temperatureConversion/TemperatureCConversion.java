//Thora Cummins
//CIS406
//Temperature Conversion

package temperatureConversion;
import java.util.Scanner;


public class TemperatureCConversion {

	// vars
	Double celsius;
	Double fahrenheit;
	
	// input celsius
	public void getCelsius()
	{
		Scanner celsiusObj = new Scanner(System.in);
		System.out.println("Enter degrees in Celsius: ");
		
		celsius = celsiusObj.nextDouble();
		
		celsiusObj.close();
	}
	
	// input fahrenheit
	public void getFahrenheit()
	{
		Scanner tempObj = new Scanner(System.in);
		System.out.println("Enter degrees in Fahrenheit: ");
		
		fahrenheit = tempObj.nextDouble();		
	}
	
	// Convert celsius to fahrenheit
	public void convertCelsius()
	{
		getCelsius();
		fahrenheit = (celsius*(9/5))+32;
	}
	
	// Convert fahrenheit to celsius
	public void convertFahrenheit()
	{
		getFahrenheit();
		celsius = (fahrenheit - 32)*(5/9);
	}
	
	// print Celsius
	public void printCelsius()
	{
		convertFahrenheit();
		System.out.println("Degrees in Celsius: "+Math.round(celsius)+"\n");
	}
	
	// print Fahrenheit
	public void printFahrenheit()
	{
		convertCelsius();
		System.out.println("Degrees in Fahrenheit: "+Math.round(fahrenheit)+"\n");
	}
	
//----------------------------------------------------------------------------
	public static void main(String[] args)
	{
		TemperatureCConversion temp = new TemperatureCConversion();
		
		temp.printCelsius();
		temp.printFahrenheit();
		
		System.out.println("Bye!!");

	}

}
