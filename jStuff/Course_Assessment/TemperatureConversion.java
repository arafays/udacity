// In a galaxy far, far away, there is a planet Java. Javans also have two
// scales for measuring temperature. The Lee and the Tansey.

// 50 degrees Lee (L) = 0 degrees Tansey (T)
// 210 degrees Lee (L) = 100 degrees Tansey (T)

//The formula for converting from Lee to Tansey is
// T = 5/8(L - 50)

//Complete this class. It creates a Scanner and asks the user to enter a temperature  in Lee
// then convert the temperature to Tansey and print it.

//Sample run:
//Enter temperature 210
//100.000

//Hint: Remember how integer division works.

import java.util.Scanner;
public class TemperatureConversion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Lee: ");
        
        double lee = in.nextInt();
        double T = (5*lee - 5*50)/8; 
        System.out.printf("%.3f", T);
    }
}
