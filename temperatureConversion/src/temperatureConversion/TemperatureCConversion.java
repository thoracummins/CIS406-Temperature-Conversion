//Thora Cummins
//CIS406
//Temperature Conversion

package temperatureConversion;
import java.util.Scanner;

public class TemperatureCConversion {

	// Private vars
	Double celsius;
	Double fahrenheit;
	
	// input temperature
	public void getFahrenheit()
	{
		Scanner tempObj = new Scanner(System.in);
		System.out.println("Enter degrees in Fahrenheit: ");
		
		fahrenheit = tempObj.nextDouble();
		
		tempObj.close();
	}
	
	public void convertFahrenheit()
	{
		getFahrenheit();
		celsius = (fahrenheit - 32)*(5/9);
	}
	
	public void printCelsius()
	{
		convertFahrenheit();
		System.out.println("Degrees in Celsius: "+celsius);
	}
	
//----------------------------------------------------------------------------
	public static void main(String[] args)
	{
		TemperatureCConversion temp = new TemperatureCConversion();
		
		temp.printCelsius();

	}

}
