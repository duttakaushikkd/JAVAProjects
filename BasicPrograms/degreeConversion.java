package bootcamp;

import java.util.Scanner;

public class degreeConversion {

    public static void main(String []args)
    {
        double Fahrenheit, Celcius;
        Scanner sc= new Scanner(System.in);
        Fahrenheit = sc.nextDouble();
        Celcius = (Fahrenheit - 32)*0.625;
        System.out.println(Celcius);
    }
}
